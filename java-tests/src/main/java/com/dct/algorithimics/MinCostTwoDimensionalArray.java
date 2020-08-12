package com.dct.algorithimics;

public class MinCostTwoDimensionalArray {

	
	public static int getMinCost2D(int[][] arr,int row,int col) {
		
		if(row == -1 || col == -1) return Integer.MAX_VALUE;
		
		if(row == 0 && col == 0) return arr[0][0];
		
		int minCost1=getMinCost2D(arr, row-1, col);
		int minCost2=getMinCost2D(arr, row, col-1);
		int currentCellCost=arr[row][col];
		return currentCellCost+Math.min(minCost1, minCost2);
	}
}
