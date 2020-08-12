package com.dct.series;

public class UnionIntersectionArrays {

	public static void main(String[] args) {
		int[] arr1= {1,2,4,5,6,8};
		int[] arr2= {2,3,5,7,9,10};
		//printUnion(arr1, arr2, arr1.length, arr2.length);
		printIntersection(arr1, arr2, arr1.length, arr2.length);
	}
	
	
	private static void printUnion(int[] arr1,int arr2[],int m,int n) {
		int i=0,j=0;
		
		while(i<m && j<n) {
			
			if(arr1[i]<arr2[j])
			{
				System.out.println(arr1[i]);
				i++;
			}
			else if(arr2[j]<arr1[i])
			{
				System.out.println(arr2[j]);
				j++;
			}
			else {
				System.out.println(arr2[j]);
				i++;j++;
			}
			
			
			
		}
		
		while(i<m) {
			System.out.println(arr1[i]);
			i++;
		}
		
		while(j<n) {
			System.out.println(arr2[j]);
			j++;
		}
		
	}
	
	
	
	private static void printIntersection(int[] arr1,int arr2[],int m,int n) {
		int i=0,j=0;
		
		while(i<m && j<n) {
			
			if(arr1[i]<arr2[j])
			{
				//System.out.println(arr1[i]);
				i++;
			}
			else if(arr2[j]<arr1[i])
			{
				//System.out.println(arr2[j]);
				j++;
			}
			else {
				System.out.println(arr2[j]);
				i++;j++;
			}
			
			
			
		}
		
		/*while(i<m) {
			System.out.println(arr1[i]);
			i++;
		}
		
		while(j<n) {
			System.out.println(arr2[j]);
			j++;
		}*/
		
	}
	
}
