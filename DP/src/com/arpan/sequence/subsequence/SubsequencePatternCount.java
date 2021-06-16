package com.arpan.sequence.subsequence;

import com.arpan.utils.Utils;

public class SubsequencePatternCount {
public static void main(String[] args) {
	long startTime=Utils.getStartTime();
	String X = "subsequence";   // input string
    String Y = "sue";           // pattern
    int count=subsequencePatternCount(X,Y,X.length()-1,Y.length()-1);
    System.out.println(count);
	Utils.printExecutionTime(startTime);
}

private static int subsequencePatternCount(String x, String y, int stringIndex, int patternIndex) {
	
	if (stringIndex == 0 && patternIndex == 0) {
        return (x.charAt(stringIndex) == y.charAt(patternIndex)) ? 1: 0;
    }
	
	/*If any of index reaches below 0*/
	if(stringIndex<0) {
		return 0;
	}
	/*Pattern longer than string*/
	if(stringIndex<patternIndex) {
		return 0;
	}
	if(patternIndex<0) {
		return 1;
	}
	return ((x.charAt(stringIndex) == y.charAt(patternIndex)) ?
			subsequencePatternCount(x, y, stringIndex - 1, patternIndex - 1) : 0)
        + subsequencePatternCount(x, y, stringIndex - 1, patternIndex);
}
}
