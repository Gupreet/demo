package com.dct.algorithimics;

public class LongestCommonSubsequence {
	
	
	public static int findLcsByDividenConquer(String s1,String s2,int i1,int i2) {
		
			if (i1 == s1.length() || i2 == s2.length())//Base Case
				return 0;
			
			int c3 = 0;
			if (s1.charAt(i1) == s2.charAt(i2)) {//If current character in both the string matches, then increase the index by 1 in both the strings.
				c3 = 1 + findLcsByDividenConquer(s1, s2, i1 + 1, i2 + 1);
			}

			int c1 = findLcsByDividenConquer(s1, s2, i1, i2 + 1);//Increase index of 2nd String
			int c2 = findLcsByDividenConquer(s1, s2, i1 + 1, i2);//Increase index of 1st String
			return Math.max(c3, Math.max(c1, c2));
		
	}
	
	public static void main(String[] args) {

		String s1 = "houdini";
		String s2 = "huind";

		int[][] dp = new int[s1.length() + 1][s2.length() + 1];

		for (int i = s1.length(); i >= 1; i--) {
			for (int j = s2.length(); j >= 1; j--) {

				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					dp[i - 1][j - 1] = Math.max(1 + dp[i][j], Math.max(dp[i][j - 1], dp[i - 1][j]));
				else
					dp[i - 1][j - 1] = Math.max(dp[i][j - 1], dp[i - 1][j]);

			}
		}
		
		print2D(dp);
		
		System.out.println(dp[1][0]);

	}


		
	public static void print2D(int mat[][]) {
		// Loop through all rows
		for (int i = 0; i < mat.length; i++)

			// Loop through all elements of current row
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");
	}
}