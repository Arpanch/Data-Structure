package com.arpan.sequence.subsequence;

import com.arpan.utils.Utils;

public class LCSBottomUP {
public static void main(String[] args) {

	String x="ABD";
	String y="BECD";
	long startTime = System.nanoTime();
	int length=findLCS(x,y);
	long endTime = System.nanoTime();
	long duration=endTime - startTime;
	double seconds = (double)duration / 1_000_000_000.0;
	System.out.println(seconds);
	System.out.println(length);

}

private static int findLCS(String x, String y) {
	Integer table[][] = new Integer[x.length() + 1][y.length() + 1];

	for (int i = 0; i <= x.length(); i++) {
		table[i][0] = 0;
	}

	for (int j = 0; j <= y.length(); j++) {
		table[0][j] = 0;
	}

	for (int i = 1; i <= x.length(); i++) {
		for (int j = 1; j <= y.length(); j++) {
			if (x.charAt(i-1) != y.charAt(j-1)) {
				table[i][j] = Integer.max(table[i - 1][j], table[i][j - 1]);

			} else {
				table[i][j] = table[i - 1][j - 1] + 1;
			}
		}
	}

	Utils.printMatrix(table);
	return table[x.length()][y.length()];
}

}
