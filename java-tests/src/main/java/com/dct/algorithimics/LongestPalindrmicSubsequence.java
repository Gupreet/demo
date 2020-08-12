package com.dct.algorithimics;

import java.util.Arrays;

public class LongestPalindrmicSubsequence {

	public static int findLPSubsequenceLength(String st) {
		return LPSubsequenceAux(st, 0, st.length() - 1);
	}// end of method

	public static int findLPSustringLength(String s) {
		return LPSubString(s, 0, s.length()-1);
	}
	
	private static int LPSubsequenceAux(String st, int startIndex, int endIndex) {
		if (startIndex > endIndex) { // BASE CASE - If we have traversed more than 1/2 of string then return 0 as we
										// dont need to process it
			return 0;
		}
		if (startIndex == endIndex) { // BASE CASE - If both the index are at same position then its a palindrome as
										// its 1 character.
			return 1;
		}
		int count1 = 0;
		if (st.charAt(startIndex) == st.charAt(endIndex)) { // CASE#1 - If index pointed characters matches then we add
															// 2 to the existing known palindrome length
			count1 = 2 + LPSubsequenceAux(st, startIndex + 1, endIndex - 1);
		}
		int Count2 = LPSubsequenceAux(st, startIndex + 1, endIndex); // CASE#2 - Skip one element from beginning
		int Count3 = LPSubsequenceAux(st, startIndex, endIndex - 1); // CASE#3 - Skip one element from end
		return Math.max(count1, Math.max(Count2, Count3));
	}// end of method

	public static void main(String[] args) {
	
		String s="gyuiuvg";
		
		int[][] dp=new int[s.length()][s.length()];
		
		
		for (int col = 0; col < s.length(); col++) {
			for (int row = s.length()-1; row >=0; row--) {
				if(row>col)
					dp[row][col]=0;
				else if(row == col)
					dp[row][col]=1;
				
				else {
					if(s.charAt(row)==s.charAt(col)) {
	
					//Condition to check Palindrone substring
     					int expectedLength=col-row-1;
						int toBeUsedLength=dp[row + 1][col - 1] == expectedLength ? (2+dp[row + 1][col - 1]) : 0;
						dp[row][col] = Math.max(toBeUsedLength, Math.max(dp[row][col - 1], dp[row + 1][col]));
						
					
					//Condition to check Palindrone subsequence
					//dp[row][col] = Math.max(2+dp[row + 1][col - 1], Math.max(dp[row][col - 1], dp[row + 1][col]));
					}
					else {
						dp[row][col]=Math.max(dp[row+1][col], dp[row][col-1]);
					}					
				}

				
			}	
		}

		
		System.out.println(dp[0][s.length()-1]);
		
		
	}
	
	
	
	
	
	
	private static int LPSubString(String s,int x,int y) {
		if(x>y) return 0;
		if(x==y) return 1;
		
		int c1=0;
		if(s.charAt(x) == s.charAt(y)) {
			int rLength=y-x-1;
			if(rLength == LPSubString(s, x+1, y-1)) {
				c1=2+rLength;
			}
		}
		
		
		int c2=LPSubString(s, x+1, y);
		int c3=LPSubString(s, x, y-1);
		
		return Math.max(c1, Math.max(c2, c3));
		
		
	}
	
	
	
	
	
	
}