package com.arpan.matrix;
/*This is a tough one
 * https://www.techiedelight.com/find-longest-sequence-formed-adjacent-numbers-matrix/
 * 
 * I have created by my own and taking some hint form the code
 * */
public class LongestSequenceByAdjacentNumberInMatrix {
	public static void main(String[] args) {
		 int M[][] =
		        {
		            { 10, 13, 14, 21, 23 },
		            { 11, 9, 22, 2, 3 },
		            { 12, 8, 1, 5, 4 },
		            { 15, 24, 7, 6, 20 },
		            { 16, 17, 18, 19, 25 }
		        };
		 int longestSequence=0;
		 String longeststrSequence="";
		 System.out.println("started");
		 StringBuilder strBuilder=new StringBuilder();
		 for(int i=0;i<M.length;i++) {
			 for(int j=0;j<M[0].length;j++) {
				 strBuilder=new StringBuilder();
				 strBuilder.append(M[i][j]);
				 strBuilder.append("-->");
				 int length =findLongestSequnce(M,i,j,strBuilder)+1;
				 if(length>longestSequence) {
					 longestSequence=length;
					 longeststrSequence=strBuilder.toString();
				 }
				 System.out.println(strBuilder.toString());
			 }
			
		 }
		System.out.println("--------------------------------------");
		System.out.println(longestSequence);
		System.out.println(longeststrSequence);
	}

	private static int findLongestSequnce(int[][] m, int i, int j, StringBuilder strSequence) {
		/* Handle in valid case */
		if (i >= m.length || i < 0 || j < 0 || j >= m[0].length) {
			return 0;
		}
		int left = 0;
		int right = 0;
		int top = 0;
		int bottom = 0;

		if (j > 0 && m[i][j - 1] == m[i][j] + 1) {
			strSequence.append(m[i][j - 1]);
			strSequence.append("-->");
			left = findLongestSequnce(m, i, j - 1, strSequence) + 1;
		}

		if (j < m[0].length-1 && m[i][j + 1] == m[i][j] + 1) {
			strSequence.append(m[i][j + 1]);
			strSequence.append("-->");
			right = findLongestSequnce(m, i, j + 1, strSequence) + 1;
		}

		if (i < m.length-1 && m[i + 1][j] == m[i][j] + 1) {
			strSequence.append(m[i+1][j]);
			strSequence.append("-->");
			bottom = findLongestSequnce(m, i + 1, j, strSequence) + 1;
		}

		if (i > 0 && m[i -1][j] == m[i][j] + 1) {
			strSequence.append(m[i-1][j]);
			strSequence.append("-->");
			top = findLongestSequnce(m, i - 1, j, strSequence) + 1;
		}

		int maxValue = Integer.max(Integer.max(left, right), Integer.max(bottom, top));
		return maxValue;
	}
}
