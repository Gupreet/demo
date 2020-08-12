package com.dct.algorithimics;

public class SumOfGivenNumbers {

	public static void main(String[] args) {
			System.out.println(findSumRecurcively(0,10));
			System.out.println(findSumIteratebly(5));
	}
	
	private static int findSumRecurcively(int accumulator, int n) {

		if (n == 1)
			return accumulator + 1;

		return findSumRecurcively(accumulator + n, n - 1);
	}
	
	private static int findSumIteratebly(int n) {

		int result = 0;

		for (int i = 0; i <= n; i++) {
			result = result + i;
		}

		return result;
	}
}
