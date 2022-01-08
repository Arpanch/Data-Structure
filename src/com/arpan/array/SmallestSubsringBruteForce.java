package com.arpan.array;

public class SmallestSubsringBruteForce {
	public static void main(String[] args) {
		System.out.println(getSmallestSubsring("0101101", 3));
	}

	public static String getSmallestSubsring(String input, int k) {
		String ans = input;
		for (int i = 0; i < input.length(); i++) {
			int sum = Character.getNumericValue(input.charAt(i));
			for (int j = i + 1; j < input.length(); j++) {
				sum = sum + Character.getNumericValue(input.charAt(j));
				if (sum == k) {
					if (ans.length() > j - i + 1) {
						ans = input.substring(i, j + 1);
					} else if (ans.length() == (j - i + 1)) {
						ans = (ans.compareTo(input.substring(i, j + 1)) > 0) ? input.substring(i, j + 1) : ans;
					}
					break;
				}
			}
		}
		return ans;
	}
}
