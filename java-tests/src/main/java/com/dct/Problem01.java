package com.dct;

public class Problem01 {

	
	
	public static void main(String[] args) {

		String s1="table";
		String s2="tafle";
		findMinOperations(s1, s2);
		
		/*
		int arr[]= {6,2,8,5};
		int newArr[]= new int[arr.length];
		
		int temp=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					temp = temp * arr[j];
				}
			}
			newArr[i] = temp;
			temp = 1;

		}
		
		for (int j = 0; j < newArr.length; j++)
			System.out.println(newArr[j]);
		*/
		
	}
	
	public static void findMinOperations(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];

		for (int i1 = 0; i1 <= s1.length(); i1++) // if we have reached the end of s1, then insert all the remaining characters of s2
			dp[i1][0] = i1;

		for (int i2 = 0; i2 <= s2.length(); i2++) // if we have reached the end of s2, then delete all the remaining characters of s1
			dp[0][i2] = i2;

		print2D(dp);
		
	}
	
	public static void print2D(int mat[][]) 
    { 
        // Loop through all rows 
        for (int i = 0; i < mat.length; i++) 
  
            // Loop through all elements of current row 
            for (int j = 0; j < mat[i].length; j++) 
                System.out.print(mat[i][j] + " "); 
        
        System.out.println();
    } 
}
