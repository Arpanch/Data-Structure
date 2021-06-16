package com.arpan.sequence.subsequence;
import java.util.HashMap;
import java.util.Map;

public class LCSCache {

	private static Map<String, Integer> cache = new HashMap<>();

	public static int LCSLength(String X, String Y, int m, int n, Map<String, Integer> lookup) {
// return if the end of either string is reached
		if (m == 0 || n == 0) {
			return 0;
		}

// construct a unique map key from dynamic elements of the input
		String key = m + "|" + n;

// if the subproblem is seen for the first time, solve it and
// store its result in a map
		if (!lookup.containsKey(key)) {
// if the last character of `X` and `Y` matches
			if (X.charAt(m - 1) == Y.charAt(n - 1)) {
				lookup.put(key, LCSLength(X, Y, m - 1, n - 1, lookup) + 1);
			} else {
// otherwise, if the last character of `X` and `Y` don't match
				lookup.put(key, Integer.max(LCSLength(X, Y, m, n - 1, lookup), LCSLength(X, Y, m - 1, n, lookup)));
			}
		}

// return the subproblem solution from the map
		return lookup.get(key);
	}

	public static void main(String[] args) {

// create a map to store solutions to subproblems
		Map<String, Integer> lookup = new HashMap<>();
		String X = "ABCBDABABCBDABCBDABCBDAABCBDABABCBDABCBDABCBDA";
		String Y = "BDCABABDCABAAABBASC";
		long startTime = System.nanoTime();
		System.out.print("The length of the LCS is " + LCSLength(X, Y, X.length(), Y.length(), lookup));
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		double seconds = (double) duration / 1_000_000_000.0;
		System.out.println();
		System.out.println(seconds);

	}
}
