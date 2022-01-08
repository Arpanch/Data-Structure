package com.arpan.array;

import java.util.*;

public class MaxLengthSubArrayHavingSumK {
public static void main(String[] args) {
	int a[]= { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
	int target=8;
	printMaxLengthSubArray(a,target);
}

private static void printMaxLengthSubArray(int[] a,int target) {
	int sum=0;
	int initialIndex=0;
	int finalIndex=0;
	int resultLength=0;
	Map<Integer,Integer> map=new HashMap<>();
	map.put(0,-1);
	for (int i = 0; i < a.length; i++) {
		sum += a[i];
		if (map.containsKey(sum - target)) {
			int tempMapIndex = map.get(sum - target);
			if ((i - tempMapIndex) > resultLength) {
				resultLength = i - tempMapIndex;
				initialIndex = tempMapIndex + 1;
				finalIndex = i;
			}
		}
		map.putIfAbsent(sum, i);
	}
	System.out.println("Max length : "+resultLength);
	for(int i=initialIndex;i<=finalIndex;i++) {
		System.out.print(a[i]+", ");
	}
	
}
}
