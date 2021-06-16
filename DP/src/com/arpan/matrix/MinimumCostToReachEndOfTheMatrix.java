package com.arpan.matrix;

import java.util.HashMap;
import java.util.Map;

import com.arpan.utils.Utils;

public class MinimumCostToReachEndOfTheMatrix {

	private static Map<String,Integer> cache=new HashMap<>();

public static void main(String[] args) {
	Integer cost[][] =
		{{ 4, 7, 8, 6, 4 },
			{ 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 },
            { 4, 7, 8, 6, 4 },
            { 6, 7, 3, 9, 2 },
            { 3, 8, 1, 2, 4 },
            { 7, 1, 7, 3, 7 },
            { 2, 9, 8, 9, 3 }};
	long startTime=Utils.getStartTime();
	//int minCost=findMinCostMine(cost,0,0,cost[0][0]);
	int minCost=findMinCost(cost,cost.length, cost[0].length);
	System.out.println(minCost);
	System.out.println();
	Utils.printExecutionTime(startTime);
}

private static int findMinCostMine(Integer[][] cost, int i, int j,int currentCost) {
	
	//This loap is main---It means reject the value by max value if any of the i or j reaches end of matrix
	if(i>cost.length-1 || j >cost[0].length-1) {
		return Integer.MAX_VALUE;
	}
	
	if(i==cost.length-1 && j==cost[0].length-1) {
		return currentCost;
	}
	
	int costBottom=findMinCostMine(cost,i+1,j,(i+1>cost.length-1)?currentCost : currentCost+cost[i+1][j]);
	
	int costRight=findMinCostMine(cost,i,j+1,(j+1>cost[0].length-1)?currentCost : currentCost + cost[i][j+1]);
	
	return Integer.min(costBottom,costRight);
}

public static int findMinCost(Integer[][] cost, int m, int n)
{
    // base case
    if (n == 0 || m == 0) {
        return Integer.MAX_VALUE;
    }

    // if we are in the first cell `(0, 0)`
    if (m == 1 && n == 1) {
        return cost[0][0];
    }

    String key =m +"|"+ n;
    if(!cache.containsKey(key)) {
    // include the current cell's cost in the path and recur to find the minimum
    // of the path from the adjacent left cell and adjacent top cell.
   cache.put(key, Integer.min(findMinCost(cost, m - 1, n), findMinCost(cost, m, n - 1))
            + cost[m - 1][n - 1]);
    }
   return cache.get(key);
}

}
