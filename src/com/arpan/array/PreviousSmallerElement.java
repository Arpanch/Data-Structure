package com.arpan.array;
import java.util.Arrays;

public class PreviousSmallerElement {
public static void main(String[] args) {
	int[] input= { 7, 16, 23, 47, 26, 9, 35, 35, 9, 34, 6, 41, 29, 1, 17, 14, 8, 2, 33, 25, 20, 50, 43, 11, 47, 25, 45 };
	System.out.println(Arrays.toString(input));
	System.out.println(Arrays.toString(findLastSmallestClosestPreviousElement(input)));
}

private static int[] findLastSmallestClosestPreviousElement(int[] input) {
	int[] output=new int[input.length];
	
	int min=input[0];
	output[0]=-1;
	for(int i=1;i<input.length;i++) {
		if(input[i]>input[i-1]) {
			output[i]=input[i-1];
		}else {
			if(input[i]>output[i-1]) {
				output[i]=output[i-1];
			}else if(input[i]>min) {
				output[i]=min;
			}else {
				output[i]=-1;
				min=input[i];
			}
		}
	}
	return output;
}
}
