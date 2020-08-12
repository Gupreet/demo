package com.dct.algorithimics;

public class FactorialOfGivenNumbers {

	
	public static void main(String[] args) {
		System.out.println(calculateFactorialRecurively(1,5));
	}
	
	
	private static int calculateFactorialRecurively(int accumulator, int n) {
		if(n == 1) return accumulator;
		return (calculateFactorialRecurively(accumulator*n, n-1));
		
	}
}
