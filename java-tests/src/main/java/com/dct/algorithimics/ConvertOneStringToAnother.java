package com.dct.algorithimics;

public class ConvertOneStringToAnother {

	public static void main(String[] args) {
		System.out.println(findMinOprnAux("table", "tafle", 0, 0));
	}
	
	public static int findMinOprnAux(String s1,String s2,int i1,int i2) {

		if (i1 == s1.length()) // if we have reached the end of s1, then insert all the remaining characters of s2
			return s2.length() - i2;

		if (i2 == s2.length()) // if we have reached the end of s2, then delete all the remaining characters of s1
			return s1.length() - i1;

		if (s1.charAt(i1) == s2.charAt(i2)) // If the strings have a matching character, recursively match for the remaining lengths.
			return findMinOprnAux(s1, s2, i1 + 1, i2 + 1);
		
		int c1=1+findMinOprnAux(s1, s2, i1, i2+1); // perform insertion
		int c2=1+findMinOprnAux(s1, s2, i1+1, i2); // perform deletion
		int c3=1+findMinOprnAux(s1, s2, i1+1, i2+1); // perform replacement
		
		
		return Math.min(c1, Math.min(c2, c3));
	}
}
