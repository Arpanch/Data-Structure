package com.arpan.sequence.substring;

public class FindLongestPlaindromSubstringNaive {
public static void main(String[] args) {
	String x="love";
	System.out.println(findLongestPlaindromSubstringNaive(x));
}

private static String findLongestPlaindromSubstringNaive(String x) {
	if (x.length() <= 1) {
		return x;
	}
	String maxLenghthSubstring =x.charAt(0)+"";
	for (int i = 0; i < x.length(); i++) {
		for (int j = i + 1; j < x.length(); j++) {
			String newTemp = x.substring(i, j);
			if (isPlaindrome(newTemp)) {
				if (maxLenghthSubstring.length() < newTemp.length()) {
					maxLenghthSubstring = newTemp;
				}
			}
		}
	}
	return maxLenghthSubstring;

}

private static boolean isPlaindrome(String newTemp) {
	int low=0;
	int high=newTemp.length()-1;
	while(low<high) {
		if(newTemp.charAt(low)!=newTemp.charAt(high)) {
			return false;
		}
		low=low+1;
		high=high-1;
	}
	return true;
}
}
