package com.arpan.set;
import java.util.Arrays;
import java.util.Collections;

public class LarggestPairSubSetDivisible {

	public static void main(String[] args) {
		Integer arr[] =  {5, 10, 25, 75, 225};
		int largestPairLength=findLargestPairLength(arr);
		System.out.println(largestPairLength);
	}

	private static int findLargestPairLength(Integer[] arr) {
		Arrays.sort(arr);
		int max=0;
		for(int i=arr.length-1;i>=0;i--) {
			int tempMax=1;
			int a=arr[i];
			for(int j=i-1;j>=0;j--) {
				if(a%arr[j]==0) {
					tempMax=tempMax+1;
				}
			}
			if(tempMax>max) {
				max=tempMax;
			}
		}
		return max;
	}
}
