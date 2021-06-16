package com.arpan.string;

import com.arpan.utils.Utils;

public class EditDistanceBottomUpApproach {

public static void main(String[] args) {

	String x="sap";
	String y="sas";
	long startTime=Utils.getStartTime();
	int length=findEditLength(x,y);
	System.out.println(length);
	Utils.printExecutionTime(startTime);

}

private static int findEditLength(String x, String y) {
	if(x.isEmpty()) {
		return (y.isEmpty())?0:y.length();
	}
	
	if(y.isEmpty()) {
		return (x.isEmpty())?0:x.length();
	}
	
	Integer table[][]=new Integer[x.length()+1][y.length()+1];
	
	for(int i=0;i<=x.length();i++) {
		table[i][0]=i;
	}
	
	for(int j=0;j<=y.length();j++) {
		table[0][j]=j;
	}
	
	for(int i=1;i<=x.length();i++) {
		for(int j=1;j<=y.length();j++) {
			if(x.charAt(i-1)==y.charAt(j-1)) {
				table[i][j]=table[i-1][j-1];
			}else {
				table[i][j]=1 + Integer.min(table[i-1][j-1],Integer.min(table[i-1][j],table[i][j-1]));
			}
		}
	}
	
	Utils.printMatrix(table);
	
	return table[x.length()][y.length()];
	
}

}
