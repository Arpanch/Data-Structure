package com.arpan.array;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithZeroSum {

public static void main(String[] args) {
	int[] A = {1,0,1,0,-1,2,-2};
	 System.out.println(hasZeroSumSubarray(A));
    
}

private static int hasZeroSumSubarray(int[] a) {
	Map<Integer, Integer> map = new HashMap<>();
	int sum = 0;
	int count = 0;
	map.put(sum, 1);
	for (int i = 0; i < a.length; i++) {
		sum = sum + a[i];
		if (map.containsKey(sum)) {
			count = count + map.get(sum);
			map.put(sum,map.get(sum)+1);
		} else {
			map.put(sum, 1);
		}

	}
	return count;
	}


}
