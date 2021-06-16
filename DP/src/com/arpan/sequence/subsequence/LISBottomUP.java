package com.arpan.sequence.subsequence;

import com.arpan.utils.Utils;

public class LISBottomUP {
public static void main(String[] args) {
	Integer a[]= {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 
			0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15	
			,10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,
			4, 1, 9, 5, 13, 3, 11, 7, 15,0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
	long startTime=Utils.getStartTime();
	int length=LISBottomUP(a);
	System.out.println();
	System.out.println(length);
	Utils.printExecutionTime(startTime);
}

private static int LISBottomUP(Integer[] a) {
	
	if(a.length<=0) {
		return 0;
	}
	
	if(a.length==1) {
		return a[0];
	}
	
	Integer temp[]=new Integer[a.length];
	
	
	for(int i=0;i<temp.length;i++) {
		temp[i]=1;
	}
	
	for(int i=1;i<a.length;i++) {
		for(int j=0;j<i;j++) {
			if(a[i]>a[j] && temp[j]>=temp[i]) {
				temp[i]=temp[j]+1;
			}
		}
	}
	
	Utils.printArray(a);
	System.out.println();
	Utils.printArray(temp);
	
	return Utils.findMaxInArray(temp);
	
}
}
