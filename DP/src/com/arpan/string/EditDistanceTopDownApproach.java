package com.arpan.string;
//https://www.techiedelight.com/levenshtein-distance-edit-distance-problem/
/*
 * This time my mode was exactly written in geeks for geeks website...so its seems its correct.
 * Feeling happy.
 */
import com.arpan.utils.Utils;

public class EditDistanceTopDownApproach {
	public static void main(String[] args) {
		String x="sap";
		String y="sas";
		long startTime=Utils.getStartTime();
		int length=findEditLength(x,y,x.length()-1,y.length()-1);
		System.out.println(length);
		Utils.printExecutionTime(startTime);
	}

	private static int findEditLength(String x, String y, int i, int j) {
		if(x.isEmpty()) {
			return (y.isEmpty())?0:y.length();
		}
		
		if(y.isEmpty()) {
			return (x.isEmpty())?0:x.length();
		}
		
		if(i<0) {
			return j+1;
		}
		if(j<0) {
			return i+1;
		}
		
		if(x.charAt(i)==y.charAt(j)) {
			return findEditLength(x,y,i-1,j-1);
		}
		
		int replacingChracter=findEditLength(x,y,i-1,j-1);
		int insertionChracter=findEditLength(x,y,i,j-1);
		int deletionChracter=findEditLength(x,y,i-1,j);
		
		int min=Integer.min(replacingChracter, Integer.min(insertionChracter, deletionChracter))+1;
		return min;
		
		
	}
}
