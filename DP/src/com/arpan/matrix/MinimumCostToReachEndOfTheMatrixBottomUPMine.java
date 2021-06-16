package com.arpan.matrix;

import com.arpan.utils.Utils;

public class MinimumCostToReachEndOfTheMatrixBottomUPMine {
	public static void main(String[] args) {
		long startTime=Utils.getStartTime();
		Integer[][] cost =
	        {
	            { 4, 7, 8, 6, 4 },
	            { 6, 7, 3, 9, 2 },
	            { 3, 8, 1, 2, 4 },
	            { 7, 1, 7, 3, 7 },
	            { 2, 9, 8, 9, 3 }
	        };
		int length=findMinCost(cost);
		System.out.println();
		System.out.println(length);
		Utils.printExecutionTime(startTime);
	}

	private static int findMinCost(Integer[][] cost) {
		
		Integer[][] table=new Integer[cost.length+1][cost[0].length+1];
		// Add Max value in each row
		for(int i=0;i<table.length;i++) {
			table[i][0]=Integer.MAX_VALUE;
		}
		//Add Max value in each column
		for(int j=0;j<table.length;j++) {
			table[0][j]=Integer.MAX_VALUE;
		}
		
		
		for(int i=1;i<=cost.length;i++) {
			for(int j=1;j<=cost[0].length;j++) {
				/* This is to add the first value*/
				if(i==1 && j==1) {
					table[i][j]=cost[i-1][j-1];
					continue;
				}
				
				table[i][j]=cost[i-1][j-1]+ Integer.min(table[i-1][j],table[i][j-1]);
			}
		}
		
		return table[cost.length][cost[0].length];
		
	}
}
