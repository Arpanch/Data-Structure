package com.arpan.sequence.subsequence;

public class SumWithMinCoins {
public static void main(String[] args) {
	int[] coins= { 2, 3};
	int sum=4;
	System.out.println(findMinCoins(coins,sum));
}

private static int findMinCoins(int[] coins, int sum) {
	
	if(sum==0) {
		return 0;
	}
	
	if(sum < 0) {
		return Integer.MAX_VALUE;
	}
	Integer totalCoins=Integer.MAX_VALUE;
	
	for(int i=0;i<coins.length;i++) {
		int including=findMinCoins(coins,sum-coins[i]);
		if(including!=Integer.MAX_VALUE) {
			including=including+1;
		}
		
		totalCoins=Integer.min(totalCoins,including);
	}
	return totalCoins;
}
}
