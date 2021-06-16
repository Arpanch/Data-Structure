package com.arpan.sequence.subsequence;

import java.util.HashMap;
import java.util.Map;

import com.arpan.utils.Utils;

public class LPalindromS {

	private static Map<String, Integer> cache = new HashMap<>();

	public static void main(String[] args) {
		long startTime = Utils.getStartTime();
		String x = "ABCBDABABCBDABCBDABCBDAABCBDABABCBDABCBDABCBDAABCBDABABCBDABCBDABCBDAABCBDABABCBDABCBDABCBDA";
		int length = findLongestPalindromeSequenceLength(x, 0, x.length() - 1);
		System.out.println(length);
		Utils.printExecutionTime(startTime);
	}

	private static int findLongestPalindromeSequenceLength(String x, int i, int j) {
		if (i > j) {
			return 0;
		}

		if (i == j) {
			return 1;
		}
		String key = i + "|" + j;
		
		if (!cache.containsKey(key)) {
			if (x.charAt(i) == x.charAt(j)) {
				cache.put(key, 2 + findLongestPalindromeSequenceLength(x, i + 1, j - 1));
			} else {
				cache.put(key, Integer.max(findLongestPalindromeSequenceLength(x, i + 1, j),
						findLongestPalindromeSequenceLength(x, i, j - 1)));
			}
		}
		return cache.get(key);
	}
}
