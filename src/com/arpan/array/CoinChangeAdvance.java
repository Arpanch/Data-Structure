package com.arpan.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoinChangeAdvance {
	private static Map<Integer,List<String>> cache=new HashMap<>();
	
public static void main(String[] args) {
	
	int [] coins= {1,2,3,4,5};
	int sum=8;
	List<String> list =getAllCombos(coins,sum,0);
	for(String x : list) {
		System.out.println(x.substring(1));
	}
	
}

private static List<String> getAllCombos(int[] coins, int sum,int index) {

	if (sum <= 0) {
		List<String> baseList = new ArrayList<>();
		if (sum == 0) {
			baseList.add("");
		}
		return baseList;
	}
	System.out.println(sum+ " inde   x: "+index);
	List<String> myList = new ArrayList<>();

	for (int i = index; i < coins.length; i++) {
		List<String> result = getAllCombos(coins, sum - coins[i],i);
		for (String x : result) {
			myList.add(x + "," + coins[i]);
		}
	}
	return myList;
}

private static List<String> getAllComboWithCache(int[] coins, int sum,int index) {

	if (sum <= 0) {
		List<String> baseList = new ArrayList<>();
		if (sum == 0) {
			baseList.add("");
		}
		return baseList;
	}
	System.out.println(sum+ " index: "+index);
	List<String> myList = new ArrayList<>();

	for (int i = index; i < coins.length; i++) {
		List<String> result= new ArrayList<>();
		if (!cache.containsKey(sum - coins[i])) {
			result = getAllComboWithCache(coins, sum - coins[i], i);
			cache.put(sum - coins[i], result);
		}else {
			result = cache.get(sum - coins[i]);
		}
		for (String x : result) {
			myList.add(x + "," + coins[i]);
		}
	}
	return myList;
}


}
