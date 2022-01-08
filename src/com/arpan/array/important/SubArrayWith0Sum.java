package com.arpan.array.important;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArrayWith0Sum {
public static void main(String[] args) {
	int a[]={5,0,0,0};
	System.out.println(checkSubarraySum(a,3));
}

private static boolean isSubArrayExist(int[] a) {
	Set<Integer> set=new HashSet<>();
	set.add(0);
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
		if(!set.contains(a[i])) {
			set.add(sum);
		}else {
			return true;
		}
	}
	return false;
}

public static boolean checkSubarraySum(int[] nums, int k) {
	Map<Integer, Integer> map = new HashMap<>();
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
		sum = sum + nums[i];
		Integer x = sum % k;
		if (map.containsKey(x) && i - map.get(x) >= 2) {
			return true;
		} else if (x == 0 && i >= 1) {
			return true;
		} else {
			map.putIfAbsent(x, i);
		}
	}
	return false;
}

public static boolean checkSubarraySumn(int[] nums, int k) {

	// sepcial case
	if (nums.length == 1) {
		return false;
	}

	Map<Integer, Integer> map = new HashMap<>();
	// running sum of elements which index from 0 to i
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
		sum += nums[i];
		// equal n*k means that after sum mod equals 0
		sum = sum % k;
		// when sum equal 0 means that sum(0-i) == 0, there are i+1 elements included,
		// determine whether i+1 >=2;
		if (sum == 0) {
			if (i >= 1)
				return true;
			// when sum not equal 0 means that should find a sum which currentsum - sum ==
			// 0, the number of elements included is i - index of sum;
		} else {
			if (map.containsKey(sum) && i - map.get(sum) >= 2)
				return true;
		}
		// minimize the space
		map.putIfAbsent(sum, i);
	}

	return false;

}

}
