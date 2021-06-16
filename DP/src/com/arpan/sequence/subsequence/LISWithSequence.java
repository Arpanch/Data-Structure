package com.arpan.sequence.subsequence;

import java.util.*;

import com.arpan.utils.Utils;

public class LISWithSequence {
	public static void main(String[] args) {
		Integer a[]= {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 
				0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15	
				,10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,
				4, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		long startTime=Utils.getStartTime();
		Map<Integer,List<Integer>> actualSequence=new HashMap<Integer, List<Integer>>();
		int length=LISBottomUP(a,actualSequence);
		System.out.println();
		System.out.println(length);
		
		Utils.printExecutionTime(startTime);
	}

	private static int LISBottomUP(Integer[] a,Map<Integer,List<Integer>> actualSequence) {
		
		if(a.length<=0) {
			return 0;
		}
		
		if(a.length==1) {
			return a[0];
		}
		
		Integer temp[]=new Integer[a.length];
		
		
		for(int i=0;i<temp.length;i++) {
			temp[i]=1;
			actualSequence.put(i,new ArrayList<>());
			actualSequence.get(i).add(a[i]);
		}
		
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]>a[j] && temp[j]>=temp[i]) {
					temp[i]=temp[j]+1;
					List<Integer> newList=new ArrayList<>();
					newList.addAll(actualSequence.get(j));
					newList.add(a[i]);
					actualSequence.put(i,newList);
				}
			}
		}
		
		Utils.printArray(a);
		System.out.println();
		Utils.printArray(temp);
		System.out.println();
		
		
		  actualSequence.forEach((k,v)->{ System.out.print("Key "+k+"-->");
		  Utils.printList(v); System.out.println(); });
		 
		System.out.println();
		int max = Integer.MIN_VALUE;
		int maxIndex=0;
		for (int i = 0; i < a.length; i++) {
			if (temp[i] > max) {
				max = temp[i];
				maxIndex=i;
			}
		}
		
		System.out.print("Key having LIS "+maxIndex+"-->");
		Utils.printList(actualSequence.get(maxIndex));
		return max;
		
	}
}
