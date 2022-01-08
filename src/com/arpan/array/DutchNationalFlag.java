package com.arpan.array;

import java.util.Arrays;

public class DutchNationalFlag {
public static void main(String[] args) {

	int[] A = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
	 
    threeWayPartition(A);
    System.out.println(Arrays.toString(A));

}

private static void threeWayPartition(int[] a) {
	int low = 0;
	int max = a.length - 1;
	int move = 0;

	while (move <= max) {
		if (a[move] == 0) {
			swap(a, move, low);
			move++;
			low++;
		} else if (a[move] == 1) {
			move++;
		} else {
			if (a[max] == 2) {
				max--;
			} else {
				swap(a, move, max);
				max--;
			}
		}
	}

}

private static void swap(int[] a, int move, int low) {
	int temp=a[low];
	a[low]=a[move];
	a[move]=temp;
}
}
