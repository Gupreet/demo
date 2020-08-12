package com.dct;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.dct.algorithimics.ConvertOneStringToAnother;
import com.dct.algorithimics.HouseThief;
import com.dct.algorithimics.LongestCommonSubsequence;
import com.dct.algorithimics.LongestPalindrmicSubsequence;
import com.dct.algorithimics.MinCostTwoDimensionalArray;
import com.dct.algorithimics.ZeroKnapsack;
import com.dct.series.LongestCommonSpan;

public class RecursiveProblemTest {

	
	//@Test
	void testHouseThief() {
		int arr[]= {6,7,1,30,8,2,4};
		assertEquals(41, HouseThief.maxMoneyRecursion(arr,0));
	}
	
	@Test
	void testConvertOneStringToAnother() {
		assertEquals(2, ConvertOneStringToAnother.findMinOprnAux("table", "tahjle", 0, 0));
	}
	
	//@Test
	void testZeroKnapSackProblem() {
		int[] profits = { 31, 26, 72, 17 };
		int[] weights = { 3, 1, 5, 2 };
		assertEquals(98,ZeroKnapsack.knapsackAux(profits, weights, 7, 0));
	}
	
	//@Test
	void testLCS() {
		assertEquals(6, LongestCommonSubsequence.findLcsByDividenConquer("elephant", "elefant", 0, 0));
	}
	
	//@Test
	void testLongestPalindrmicSubsequence() {
		String s="cdac";
		System.out.println(LongestPalindrmicSubsequence.findLPSubsequenceLength(s));
		assertEquals(3, LongestPalindrmicSubsequence.findLPSubsequenceLength(s));
	}
	
	//@Test
	void testLongestPalindrmicSubStringTest() {
		String s="bscacsd";
		System.out.println(LongestPalindrmicSubsequence.findLPSustringLength(s));
		assertEquals(5, LongestPalindrmicSubsequence.findLPSustringLength(s));
	}
	
	//@Test
	void testMinCost2D() {
		int[][] array =
			{
				{ 4, 7, 8, 6, 4 },
				{ 6, 7, 3, 9, 2 },
				{ 3, 8, 1, 2, 4 },
				{ 7, 1, 7, 3, 7 },
				{ 2, 9, 8, 9, 3 }
			};
		System.err.println(array[2][3]);
		assertEquals(36, MinCostTwoDimensionalArray.getMinCost2D(array,array.length-1, array[0].length-1));
	}
}
