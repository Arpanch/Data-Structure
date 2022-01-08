package com.arpan.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsAnyDuplicate {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {

				if (Math.abs(i - map.get(nums[i])) <= k) {
					return true;
				} else {
					map.put(nums[i], i);
				}
			} else {
				map.put(nums[i], i);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,1};
		int k=3;
		containsNearbyDuplicate(a,k);
				}
	
}
