package com.arpan.array;

import java.util.Arrays;

public class ArrayIndexNumber {
public static void main(String[] args) {
	int nums[]= {5,0,1,2,3,4};
	int n=nums.length;
    for(int i=0;i<nums.length;i++){
        int a=nums[i];
        int b=(nums[nums[i]])%n;
        nums[i]=a+(b*n);
    }
    for(int i=0;i<nums.length;i++){
        nums[i]=nums[i]/n;
    }
    System.out.println(Arrays.toString(nums));
	 
}
public static int setNum(int[] a, int i) {
	return (a[a[i]]*10)+a[i];
}
public static int getNum(int[] a, int i) {
	return a[i]/10;
}
}
