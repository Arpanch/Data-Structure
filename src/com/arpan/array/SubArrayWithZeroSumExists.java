package com.arpan.array;
import java.util.HashSet;
import java.util.Set;

/*
 * https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/
 * */
public class SubArrayWithZeroSumExists {
public static void main(String[] args) {
	int[] A = {-1,1,8,3,4,2};
	 
    if (hasZeroSumSubarray(A)) {
        System.out.println("Subarray exists");
    }
    else {
        System.out.println("Subarray does not exist");
    }
}

private static boolean hasZeroSumSubarray(int[] a) {
	Set<Integer> set=new HashSet<>();
	set.add(0);
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
		if(set.contains(sum)) {
			return true;
		}else {
			set.add(sum);
		}
	}
	return false;
}
}
