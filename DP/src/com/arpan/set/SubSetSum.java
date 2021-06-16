package com.arpan.set;
import java.util.HashMap;
import java.util.Map;

public class SubSetSum {

private static  Map<String,Boolean> cache =new HashMap<>();

public static void main(String[] args) {
	int a[]={3, 34, 4, 12, 5, 2};
	int sum=9;
	boolean isGivenSumPossible= isGivenSumPossible(a,sum,a.length-1);
	System.out.println(isGivenSumPossible);
}

private static boolean isGivenSumPossible(int[] a, int sum, int n) {
	if(sum==0) {
		return true;
	}
	
	if(sum<0) {
		return false;
	}
	boolean isSumPossible=false;
	for(int i=n;i>=0;i--) {
		boolean includeNumber=false;
		boolean excludeNumber=false;
		String includeNumberKey=(sum-a[i])+"|"+ (n-1);
		String excludeNumberKey=(sum)+"|"+ (n-1);
		
		if(cache.get(includeNumberKey)!=null) {
			includeNumber=cache.get(includeNumberKey);
		}else {
			 includeNumber=isGivenSumPossible(a,sum-a[i],n-1);
			 cache.put(includeNumberKey, includeNumber);
		}
		
		if(cache.get(excludeNumberKey)!=null) {
			excludeNumber=cache.get(excludeNumberKey);
		}else {
			excludeNumber=isGivenSumPossible(a,sum,n-1);
			cache.put(excludeNumberKey, excludeNumber);
		}
		isSumPossible=includeNumber || excludeNumber;
		
	}
	return isSumPossible;
}
}
