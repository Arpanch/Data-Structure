package com.arpan.misc.imp;
//https://medium.com/the-innovation/dynamic-programming-equal-sum-partition-problem-b5059caf46bb
import java.util.Arrays;

public class PartationProblem {
	public static void main(String[] args) {
		int a[]= { 7, 3, 1, 5, 4, 8 };
		int sumOfAll=Arrays.stream(a).sum();
		System.out.println(findParttaionPossible(a,a.length-1,sumOfAll,0));
	}

	private static boolean findParttaionPossible(int[] a, int i,int sumOfAll,int currentSum) {
		if(i<0) {
			return false;
		}
		
		if(sumOfAll==currentSum) {
			return true;
		}
		
		return findParttaionPossible(a,i-1,sumOfAll-a[i],currentSum+a[i]) || 
				findParttaionPossible(a,i-1,sumOfAll-a[i],currentSum);
		
	}
}
