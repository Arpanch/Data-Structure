package com.arpan.misc.imp;

public class Zero1Knapsack {
public static void main(String[] args) {
	int value[]= {20, 5, 10, 40, 15, 25};
	
	int weight[]= {1, 2, 3, 8, 7, 4};
	
	int totalWeight=10;
	
	int finalTheft=findTotalValue(value,weight,totalWeight,0,0);
	System.out.println(finalTheft);
}

private static int findTotalValue(int[] value, int[] weight, int totalWeight, int i,int currentValue) {
	if(i>weight.length-1) {
		return 0;
	}
	
	
	
	int including = 0;
	
	if (totalWeight - weight[i] >= 0) {
		including = findTotalValue(value, weight, totalWeight - weight[i], i + 1, currentValue + value[i]);
	}else {
		return currentValue;
	}
	
	int excluding=findTotalValue(value,weight,totalWeight,i+1,currentValue);
	
	return Integer.max(including,excluding);
}
}
