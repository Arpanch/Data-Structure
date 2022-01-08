package com.arpan.array;
import java.util.Arrays;

public class DutchNationalFlagProblem {
public static void main(String[] args) {
	int[] A = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
	 
    threeWayPartition(A);
    System.out.println(Arrays.toString(A));
}

private static void threeWayPartition(int[] a) {
	int left=0;
	int right=a.length-1;
	int move=0;
	
	while(move<=right) {
		if(a[move]==0) {
			swap(a,left,move);
			left++;
			move++;
		}else if(a[move]==2) {
			swap(a,move,right);
			right--;
		}else {
			move++;
		}
	}
}

private static void swap(int[] a,int move, int right) {
	int temp=a[right];
	a[right]=a[move];
	a[move]=temp;
	
}
}
