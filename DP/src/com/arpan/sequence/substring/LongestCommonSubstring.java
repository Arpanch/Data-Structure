package com.arpan.sequence.substring;

import com.arpan.utils.Utils;

public class LongestCommonSubstring {
	public static void main(String[] args) {

		String X = "ABC";
		String Y = "BABA";
		long startTime = System.nanoTime();
		String longestCommonSubstring = findLCSubString(X, Y);
		System.out.println(longestCommonSubstring);
		Utils.printExecutionTime(startTime);

	}

	private static String findLCSubString(String X, String Y) {
		
		Integer table[][]=new Integer[X.length()+1][Y.length()+1];
		
		int max=0;
		
		int endIndex=0;
		
		for(int i=0;i<table.length;i++) {
			table[i][0]=0;
		}
		
		for(int i=0;i<table[0].length;i++) {
			table[0][i]=0;
		}
		
		for (int i = 1; i <= X.length(); i++) {
			for (int j = 1; j <= Y.length(); j++) {
				if (X.charAt(i - 1) == Y.charAt(j - 1)) {
					table[i][j] = 1 + table[i - 1][j - 1];
					if(table[i][j] > max) {
						max=table[i][j];
						endIndex=i;
					}
				} else {
					table[i][j] = 0;
				}
			}
		}
		
		return X.substring(endIndex-max,endIndex);
	}

}
