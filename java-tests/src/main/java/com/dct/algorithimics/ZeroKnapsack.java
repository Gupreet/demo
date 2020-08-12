package com.dct.algorithimics;

public class ZeroKnapsack {

	
	public static int knapsackAux(int[] profits,int[] weight,int capacity,int currentIndex){
		
		if(capacity<=0 || currentIndex <0 || currentIndex >= profits.length)
			return 0;
		
		int profit1=0;
		if(weight[currentIndex] <= capacity)
		profit1 =profits[currentIndex]+knapsackAux(profits, weight, capacity-weight[currentIndex], currentIndex+1);
		
		int profit2=knapsackAux(profits, weight, capacity, currentIndex+1);
		return Math.max(profit1, profit2);
	}
	


}
