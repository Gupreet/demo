package com.dct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BalancedParenthesesTest {
	
	BalancedParentheses balancedParentheses;
	
	@BeforeEach
	void init() {
		balancedParentheses = new BalancedParentheses(); 
	}
	
	@Test
	public void balancedParenthesesTest() {
		String s = "{()}[]";
		Assertions.assertEquals(true,balancedParentheses.isBalancedParan(s));
		
		
	}
	
	
	
	
	
}
