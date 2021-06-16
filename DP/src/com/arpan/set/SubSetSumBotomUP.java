package com.arpan.set;

import com.arpan.utils.Utils;

// A Dynamic Programming solution for subset
// sum problem
public class SubSetSumBotomUP {

	// Returns true if there is a subset of
	// set[] with sun equal to given sum
	static Boolean[][] isSubsetSum(int set[],
							int n, int sum)
	{
		Boolean subset[][] = new Boolean[n + 1][sum + 1];

		
		for (int i = 1; i <= sum; i++) {
			subset[0][i] = false;
		}
		
		for (int i = 0; i <= n; i++) {
			subset[i][0] = true;
		}
			

		// Fill the subset table in botton
		// up manner
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if(set[i-1]>j) {
					subset[i][j] = subset[i-1][j];
				}else {
				boolean includingSetElement=j-set[i-1]<0 ? false :  subset[i - 1][j-set[i-1]];
					subset[i][j] = subset[i-1][j]
								|| includingSetElement;
				}
			}
		}

		Utils.printMatrix(subset);

		return subset;
	}
	
	

	/* Driver code*/
	public static void main(String args[])
	{
		int set[] = { 17,19, 2, 3 };
		int sum = 41;
		int n = set.length;
		isSubsetSumPossible(set, n, sum);
	}



	private static void isSubsetSumPossible(int[] set, int n, int sum) {
		Boolean subset[][] = isSubsetSum(set,n,sum);
		if(subset[n][sum]==true) {
			System.out.println("Found a subset: "+ getSubSet(subset,set));
		}else {
			System.out.println("Subset Sum is not possible.");
		}
		
	}



	private static String getSubSet(Boolean[][] subset,int set[]) {
		StringBuilder strBuilder=new StringBuilder();
		strBuilder.append("{");
		int j=subset[0].length-1;
		for (int i = 0; i < subset.length; i++) {
			if (subset[i][j] == true) {
				strBuilder.append(set[i - 1]);
				strBuilder.append(",");

				j = j - set[i - 1];
				i = 0;
				if (j == 0) {
					break;
				}

			}

		}
		strBuilder.replace(strBuilder.length()-1,strBuilder.length(),"");
		strBuilder.append("}");
		return strBuilder.toString();
	}
	
}


