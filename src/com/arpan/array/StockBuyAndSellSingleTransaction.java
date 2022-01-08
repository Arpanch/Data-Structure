package com.arpan.array;

public class StockBuyAndSellSingleTransaction {
public static void main(String[] args) {
	int[] prices= {5,4,3,2,1};
	int maxProfit=getProfit(prices);
	System.out.println(maxProfit);
}

private static int getProfit(int[] prices) {
	int min=Integer.MAX_VALUE;
	int profit=0;
	for(int i=0;i<prices.length;i++) {
		if(min>prices[i]) {
			min=prices[i];
		}
		if(prices[i]-min>profit) {
			profit=prices[i]-min;
		}
	}
	return profit;
}
}
