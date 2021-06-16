package com.arpan.sequence.subsequence;

import com.arpan.utils.Utils;

public class LCSBottomUPSpaceOptimized {
	public static void main(String[] args) {

		String x="XMJYAUZ";
		String y="MZJAWXU";
		long startTime = Utils.getStartTime();
		int length=findLCS(x,y);
		Utils.printExecutionTime(startTime);
		System.out.println(length);

	}

	private static int findLCS(String x, String y) {
		int table[][] = new int[2][y.length() + 1];

		for (int i = 0; i <2; i++) {
			table[i][0] = 0;
		}

		for (int j = 0; j <= y.length(); j++) {
			table[0][j] = 0;
		}

		for (int i = 1; i <= x.length(); i++) {
			for (int j = 1; j <= y.length(); j++) {
				int modifiedIIndex = i % 2;
				if (x.charAt(i - 1) != y.charAt(j - 1)) {
					if (modifiedIIndex != 0) {

						table[modifiedIIndex][j] = Integer.max(table[modifiedIIndex - 1][j],
								table[modifiedIIndex][j - 1]);
					} else {
						table[modifiedIIndex][j] = Integer.max(table[modifiedIIndex + 1][j],
								table[modifiedIIndex][j - 1]);
					}
				} else {
					if (modifiedIIndex != 0) {
						table[modifiedIIndex][j] = table[modifiedIIndex - 1][j - 1] + 1;
					} else {
						table[modifiedIIndex][j] = table[modifiedIIndex + 1][j - 1] + 1;
					}
				}
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <= y.length(); j++) {
				System.out.print((table[i][j])>9?table[i][j]: table[i][j] +" ");
				System.out.print(" ");
			}
			System.out.println();
		}
		return table[x.length()%2][y.length()];
	}

}
