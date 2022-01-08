package com.arpan.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class printAllArrayWith0Sum {
public static void main(String[] args) {
	int[] input={ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
	printAllSubArraysWith0Sum(input);
}

private static void printAllSubArraysWith0Sum(int[] input) {
	Map<Integer,List<Integer>> sumAndIndexsMap=new HashMap<>();
	List<Integer> initialList=new ArrayList<>();
	initialList.add(-1);
	sumAndIndexsMap.put(0,initialList);
	int sum=0;
	for(int i=0;i<input.length;i++) {
		sum=sum+input[i];
		List<Integer> indexes=sumAndIndexsMap.getOrDefault(sum,new ArrayList<>());
		if(!indexes.isEmpty()) {
			for(Integer index : indexes) {
				System.out.print("{");
				for(int j=index+1;j<=i;j++) {
					System.out.print(input[j]+", ");
				}
				System.out.print("}");
				System.out.println();
			}
		}
		indexes.add(i);
		sumAndIndexsMap.put(sum, indexes);
	}
}
}
