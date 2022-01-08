package com.arpan.array;

public class StockInfiniteBuyAndSell {
	
	public static void main(String[] args) {
		int[] prices= {1,3,2,5,6};
		int maxProfit=getProfit(prices);
		System.out.println(maxProfit);
	}

	private static int getProfit(int[] prices) {
		int profit=0;
		int b=0;
		int s=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]>prices[i-1]) {
				s++;
			}else {
				profit=profit+prices[s]-prices[b];
				b=i;
				s=i;
			}
			
		}
		profit=profit+prices[s]-prices[b];
		return profit;
	}
}
