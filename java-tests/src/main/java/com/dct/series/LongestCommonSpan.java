package com.dct.series;

public class LongestCommonSpan {

	static int[] arr1= {0,1,0,0,0,0};
	static int[] arr2= {1,0,1,0,0,1};
	public static void main(String[] args) {
		System.out.println(longestCommonSum(arr1.length));
	}
	
	static int longestCommonSum(int n) {
		int maxLen=0;
		for (int i = 0; i < n; i++) {
			
			int sum1=0,sum2=0;
			for (int j = i; j < n; j++) {
				
				sum1 =sum1+arr1[j];
				sum2 =sum2+arr2[j];
				
				
				if(sum1==sum2) {
					int len=j-i+1;
					
					if(len>maxLen) maxLen=len;
					
				}
				
			}	
			
		}
		return maxLen;
	}
	
	
	
	
}
