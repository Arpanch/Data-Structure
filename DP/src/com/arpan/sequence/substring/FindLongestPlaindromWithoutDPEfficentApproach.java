package com.arpan.sequence.substring;
/*
 * https://www.techiedelight.com/longest-palindromic-substring-non-dp-space-optimized-solution/
 * But done by me
 */

public class FindLongestPlaindromWithoutDPEfficentApproach {
public static void main(String[] args) {
	String x="maam";
	System.out.println(FindLongestPlaindromWithoutDPEfficentApproach(x));
}

private static String FindLongestPlaindromWithoutDPEfficentApproach(String x) {
	if(x.length()<=1) {
		return x;
	}
	String maxSubstring="";
	for(int i=0;i<x.length();i++) {
		String expandedSubstringAsOdd=expand(x,i,i);
		if(expandedSubstringAsOdd.length()>maxSubstring.length()) {
			maxSubstring=expandedSubstringAsOdd;
		}
		String expandedSubstringAsEven=expand(x,i,i+1);
		if(expandedSubstringAsEven.length()>maxSubstring.length()) {
			maxSubstring=expandedSubstringAsEven;
		}
		
		
	}
	return maxSubstring;
}

private static String expand(String x, int start, int end) {
	int low=start;
	int high=end;
	while(low>=0 && high <x.length()) {
		if(x.charAt(low)==x.charAt(high)) {
			low--;
			high++;
		}else {
			break;
		}
		
	}
	return x.substring(low+1,high);
}
}
