package com.arpan.array;

public class MaximumDistanceBetweenTwoNumber {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
		System.out.println(findMaxDifference(arr));

	}

	private static int findMaxDifference(int[] arr) {
		int min = Integer.MAX_VALUE;
		int maxDiffernce = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (maxDiffernce < arr[i] - min) {
				maxDiffernce = arr[i] - min;
			}
		}
		return maxDiffernce;
	}
}
