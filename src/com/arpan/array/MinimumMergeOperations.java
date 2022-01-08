package com.arpan.array;

public class MinimumMergeOperations {
public static void main(String[] args) {
	int[] arr = { 4,1,3,4,1 }; 
    int min = findMin(arr);
    System.out.println("The minimum number of operations required is " + min);
}

private static int findMin(int[] arr) {
	int left=0;
	int right=arr.length-1;
	int operation=0;
	while(left<right) {
		if(arr[left]==arr[right]) {
			left++;
			right--;
		}else if(left+1<right && (arr[left]+arr[left+1])==arr[right]) {
			operation++;
			left=left+2;
			right--;
		}else if(left<right-1 && arr[left]==(arr[right]+arr[right-1])) {
			operation++;
			left++;
			right=right-2;
		}else if(left+1<right+1 && (arr[left]+arr[left+1])==(arr[right]+arr[right-1])){
			operation=operation+2;
			left=left+2;
			right=right-2;
		}
	}
	return operation;
}
}
