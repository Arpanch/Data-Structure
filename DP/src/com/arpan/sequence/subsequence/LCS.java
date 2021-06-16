package com.arpan.sequence.subsequence;
import java.util.HashMap;
import java.util.Map;

public class LCS {
private static Map<String,Integer> cache=new HashMap<>();

public static void main(String[] args) {
	String x="ABCAD";
	String y="DBECD";
	long startTime = System.nanoTime();
	int length=findLCS(x,y,0,0);
	long endTime = System.nanoTime();
	long duration=endTime - startTime;
	double seconds = (double)duration / 1_000_000_000.0;
	System.out.println(seconds);
	System.out.println(length);
}

private static int findLCS(String x, String y, Integer i, Integer j) {
	if (i > x.length() - 1 || j > y.length() - 1) {
		return 0;
	}
	String key = i + "|" + j;
	if (!cache.containsKey(key))
	{
		if (x.charAt(i) == y.charAt(j)) {
			cache.put(key, findLCS(x, y, i + 1, j + 1) + 1);
		} else {
			cache.put(key, Integer.max(findLCS(x, y, i + 1, j), findLCS(x, y, i, j + 1)));
		}
	}
	return cache.get(key);
}
}
