package com.dct;

import java.util.Objects;

public class LongestPalindrome {

	
	public String findLongestPalindrome(String input) {
		String chars[] = input.split("");
		String palindrome = null;
		for (int i = 0; i < chars.length; i++) {

			String left = chars[i];

			for (int j = chars.length - 1; j > i; j--) {
				String right = chars[j];

				if (Objects.equals(left, right)) {
					String first = input.substring(i, j + 1);

					if (Objects.equals(first, reverse(first))) {
						if (palindrome == null || first.length() > palindrome.length()) {
							palindrome = first;
						}
					}

				}

			}

		}

		return palindrome;
	}
	
	
	private static String reverse(String in) {
	
		char ch[]= new char[in.length()];
		
		for (int i = ch.length-1; i >= 0; i--) {
			ch[(ch.length-1)-i] = in.charAt(i);
		}
		 return String.valueOf(ch);
		
	}
}
