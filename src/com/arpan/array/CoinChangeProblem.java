package com.arpan.array;

public class CoinChangeProblem {

public static void main(String[] args) {
	int [] coins= {1,2,3};
	int sum=3;
	printCombinations(coins,sum,"",0);
}

private static void printCombinations(int[] coins, int sum, String string,int index) {
	
	if(sum<=0) {
		if(sum==0) {
		System.out.println(string.substring(1));
		}
		return;
	}
	for(int i=index;i<coins.length;i++) {
		printCombinations(coins,sum-coins[i],string+","+coins[i],i);
	}
	
}
}
