package com.arpan.array;

public class ArrayMedianWithExtraMemory {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	    int medianTerm1=0;
	    int medianTerm2=0;
	    int length=nums1.length + nums2.length;
	    
	    int medianTermNo1=Integer.MIN_VALUE;
	    int medianTermNo2=Integer.MIN_VALUE;
	    if(length%2==0) {
	    	medianTermNo2=length/2;
	    	medianTermNo1=medianTermNo2-1;
	    }else {
	    	medianTermNo1=length/2;
	    	medianTermNo2=medianTermNo1;
	    }
	    
	    int counter=0;
	    
		for (int i = 0, j = 0; i < nums1.length || j < nums2.length;) {
			int temp = 0;

			if (i < nums1.length && j < nums2.length) {
				if (nums1[i] < nums2[j]) {
					temp = nums1[i];
					i++;
				} else if (nums2[j] <= nums1[i]) {
					temp = nums2[j];
					j++;
				}
			} else if (i < nums1.length) {
				temp = nums1[i];
				i++;
			} else if (j < nums2.length) {
				temp = nums2[j];
				j++;
			}
			if (counter == medianTermNo1) {
				medianTerm1 = temp;
			}
			if (counter == medianTermNo2) {
				medianTerm2 = temp;
				break;
			}
			counter++;

		}
		
		
	    if(length%2==0) {
	    	return ((double)(medianTerm1 + medianTerm2))/2;
	    }
	    return (double)medianTerm1;
	    		
    }
	public static void main(String[] args) {
		int[] a = {1,3};
		int[] b = {2};
		System.out.println(findMedianSortedArrays(a,b));
		
	}
}
