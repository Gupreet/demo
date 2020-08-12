package com.dct.series;

public class FindMissingNumber {

	
	public static int findMissingNumber(int[] arr) {
		
		int total;
		int n=arr.length;
		total=(n+1)*(n+2)/2;
		
		for (int i = 0; i < arr.length; i++) 
			total=total-arr[i];
		
		System.out.println(total);
		return total;
	}
	
}
