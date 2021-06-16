package com.arpan.sequence.subsequence;

import java.util.HashMap;
import java.util.Map;

import com.arpan.utils.Utils;

/*Longest Increasing Subsequence*/
public class LIS {
	
	private static Map<String,Integer> cache=new HashMap<>();
	
	public static void main(String[] args) {
		Integer a[]= {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 
				0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15	
				,10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,
				4, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		long startTime=Utils.getStartTime();
		System.out.println(findLISLength(a,0,Integer.MIN_VALUE));
		Utils.printExecutionTime(startTime);
		
	}

	private static int findLISLength(Integer[] a, int i,int currentNumber) {
		if(i==a.length) {
			return 0;
		}
		String key= i + "|" + currentNumber;
		if(!cache.containsKey(key)) {
		
		int excludingNo=findLISLength(a,i+1,currentNumber);
		
		
		int includingNo=0;
		
		if(a[i]>currentNumber) {
			includingNo=1+findLISLength(a,i+1,a[i]);
		}
		int lengthNew=Integer.max(includingNo, excludingNo);
		cache.put(key, lengthNew);
		
		}
		return cache.get(key);
	}

}
