package com.arpan.utils;

import java.util.List;

public class Utils {

	public static <T> void printMatrix(T a[][]) {
		if (a instanceof Integer[][]) {
			Integer table[][]=(Integer[][])a;
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[0].length; j++) {
					System.out.print((table[i][j])>9?table[i][j]+" ": table[i][j] +"  ");
				}
				System.out.println();
			}
		}
		
		if (a instanceof Boolean[][]) {
			Boolean table[][]=(Boolean[][])a;
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[0].length; j++) {
					System.out.print ((table[i][j])?1:0);
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void printExecutionTime(long startTime) {
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		double seconds = (double) duration / 1_000_000_000.0;
		System.out.println(seconds);
	}
	
	public static long getStartTime() {
		return System.nanoTime();
	}
	
	public static int findMaxInArray(Integer a[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		return max;
	}
	
	public static <T> void printArray(T a[]) {
		if (a instanceof Integer[]) {
			Integer arr[] = (Integer[]) a;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(a[i]+" ");
			}
		}

		if (a instanceof Boolean[]) {
			Boolean arr[] = (Boolean[]) a;
			for (int i = 0; i < arr.length; i++) {
				System.out.print(a[i] + " ");
			}
		}
	}
	
	public static  void printList(List<Integer> list) {
		list.stream().forEach(a->{
			System.out.print(a+ " ");
		});
	}
	
}
