package com.dct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {

	
	LongestPalindrome longestPalindrome;
	
	@BeforeEach
	void init() {
		System.out.println("inside @BeforeEach");
		longestPalindrome = new LongestPalindrome(); 
		
	}
	
	@Test
	void testPalindrone() {
		Assertions.assertAll(
				()->Assertions.assertEquals("mmmmmmmmmmmmmmmm", longestPalindrome.findLongestPalindrome("saasdcjkbkjnjnnknvjfknjnfjkvnjkfdnvjknfdkvjnkjfdnvkjnvjknjkgnbjkngkjvnjkgnbvkjngfreyh67ujrtyhytju789oijtnuk789oikmtul0oymmmmmmmmmmmmmmmm")
		));
	}
	
}
