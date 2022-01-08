package com.arpan.array;
//1101
public class Subsring0And1 {
public static void main(String[] args) {
	System.out.println(getSmallestSubsring("11101011010",3));
}
public static String getSmallestSubsring(String input,int k) {
	String ans=input;
	int i=-1;
	int j=-1;
	
	int sum=0;
	while (true) {
		boolean flag1 = false;
		boolean flag2 = false;

		// acquire
		while (i < input.length()-1 && sum != k) {
			i++;
			sum = sum + Character.getNumericValue(input.charAt(i));
			flag1 = true;
		}
		
		// release
		while (j < i && sum == k) {
			if(ans.length() > input.substring(j + 1, i+1).length()) {
				ans=input.substring(j + 1, i+1);
			}else if(ans.length()==input.substring(j + 1, i+1).length()) {
				ans=(ans.compareTo(input.substring(j + 1, i+1))>0)?input.substring(j + 1, i+1):ans;
			}
			j++;
			sum = sum - Character.getNumericValue(input.charAt(j));
			flag1 = true;
		}

		if (!flag1 && !flag2) {
			break;
		}

	}
	
	return ans;
}

}
