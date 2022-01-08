package com.arpan.array;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithEqualNoOf0sAnd1s {
public static void main(String[] args) {
	int[] input={ 0, 0, 1, 0, 1, 1, 0 };
	printLargestSubArrayHavingSameNoOf0And1s(input);
}

private static void printLargestSubArrayHavingSameNoOf0And1s(int[] input) {
	for (int i = 0; i < input.length; i++) {
		if (input[i] == 0) {
			input[i] = -1;
		}
	}
	Map<Integer,Integer> mapAndIndexMap=new HashMap<>();
	mapAndIndexMap.put(0,-1);
	int sum=0;
	int iniIndex=0;
	int endIndex=0;
	int len = 0;
	for(int i=0;i<input.length;i++) {
		sum=sum+input[i];
		if(mapAndIndexMap.containsKey(sum)) {
			if(len < i-mapAndIndexMap.get(sum)) {
			iniIndex=mapAndIndexMap.get(sum)+1;
			endIndex=i;
			len=i-mapAndIndexMap.get(sum);
			}
		}else {
			mapAndIndexMap.put(sum,i);
		}
	}
	System.out.println(iniIndex+", "+endIndex);
	System.out.println();
	System.out.print("{");
	for(int i=iniIndex;i<=endIndex;i++) {
		if(input[i]==-1)
		System.out.print("0, ");
		else {
			System.out.print("1, ");
		}
	}
	System.out.print("}");
	}
	
}
