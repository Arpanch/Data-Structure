package com.arpan.array;

public class StockBuyAndSellTwoTransactions {
	public static void main(String[] args) {
		int[] prices= {1,3,2,5,6};
		int maxProfit=maxProfit(prices);
		System.out.println(maxProfit);
	}
	public static int maxProfit(int[] prices) {
        int l[]=new int[prices.length];
        int r[]=new int[prices.length];
        int minL=Integer.MAX_VALUE;
        int maxR=Integer.MIN_VALUE;
        int profitL=0;
        int profitR=0;
        for(int i=0,j=prices.length-1;i<prices.length && j>=0;i++,j--){
            if(prices[i]<minL){
               minL= prices[i];
            }
            if(prices[j]>maxR){
                maxR=prices[j];
            }
            if(prices[i]-minL>profitL){
                l[i]=prices[i]-minL;
                profitL=prices[i]-minL;
            }else{
                l[i]=profitL;
            }
            
             if(maxR-prices[j]>profitR){
                r[j]=maxR-prices[j];
                profitR=maxR-prices[j];
            }else{
                r[j]=profitR;
            }
        }
        
        int maxProfit=0;
        for(int i=0;i<l.length;i++){
            if(maxProfit<l[i]+r[i]){
                maxProfit=l[i]+r[i];
            }
        }
        return maxProfit;
    }
}
