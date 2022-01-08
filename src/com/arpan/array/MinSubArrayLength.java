package com.arpan.array;

public class MinSubArrayLength {
	public static void main(String[] args) {
		int input[]= {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(7,input));
	}

	static int minSubArrayLen(int s, int[] nums) {
		int n = nums.length;
		int ans = Integer.MAX_VALUE;
		int left = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += nums[i];
			while (sum >= s) {
				ans = Integer.min(ans, i + 1 - left);
				sum -= nums[left++];
			}
		}
		return (ans != Integer.MAX_VALUE) ? ans : 0;
	}
}
