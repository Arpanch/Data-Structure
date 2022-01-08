package com.arpan.array;

import java.util.HashMap;
import java.util.Map;

public class CountAllSubArrayHavingSumK {
	 public static int subarraySum(int[] nums, int k) {
	        int result=0;
	        int sum=0;
	        Map<Integer,Integer> map=new HashMap<>();
	        
	        map.put(0,1);
	        
	        for(int i=0;i<nums.length;i++){
	            sum=sum+nums[i];
	            if(map.containsKey(sum-k)){
	                result=result+map.get(sum-k);
	            }
	            map.put(sum,map.getOrDefault(sum,0)+1);
	        }
	        
	        return result;
	    }
	 public static void main(String[] args) {
		int a[]= {1,1,1,1,1};
		System.out.println(subarraySum(a,2));
	}
}
