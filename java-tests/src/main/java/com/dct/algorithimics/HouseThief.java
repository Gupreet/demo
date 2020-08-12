package com.dct.algorithimics;

public class HouseThief {
	/*
	public static void main(String[] args) {
		int arr[]= {6,7,1,30,8,2,4};
		
		System.out.println(maxMoneyRecursion(arr, 0));
		
	}*/
	
	public static int maxMoneyRecursion(int arr[],int currentIndex) {
		if(currentIndex >= arr.length)
			return 0;
		
		int stealCurrentHouse=arr[currentIndex] +maxMoneyRecursion(arr, currentIndex+2);
		int skipCurrentHouse=maxMoneyRecursion(arr, currentIndex+1);
		
		return Math.max(stealCurrentHouse,skipCurrentHouse);
	}
	
	public static int maxMoneyRecursionTD(int dp[],int arr[],int currentIndex) {
		if(currentIndex >= arr.length)
			return 0;
		
		if(dp[currentIndex] == 0)
		{
			int stealCurrentHouse=arr[currentIndex] +maxMoneyRecursion(arr, currentIndex+2);
			int skipCurrentHouse=maxMoneyRecursion(arr, currentIndex+1);
			
			dp[currentIndex]=Math.max(stealCurrentHouse,skipCurrentHouse);	
		}
		
		return dp[currentIndex];
	}
	
	
	
	public static int maxMoneyRecursionTopDown(int arr[],int currentIndex){
		int[] dp=new int[arr.length+2];
		return maxMoneyRecursionTD(dp, arr, currentIndex);
	}
	
	
	public static int maxMoneyRecursionBU(int arr[]) {
		
		int[] dp=new int[arr.length+2];
		
		dp[arr.length]=0;
		
		for (int i =  dp.length; i <=0; i--) {
			dp[i]=Math.max(dp[i]+dp[1+2], dp[i+1]);
		}
        return dp[0];
	}
	
	
	

}
