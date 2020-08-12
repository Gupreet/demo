package com.dct.algorithimics;

public class BuildingLayers {

	public static void main(String[] args) {
		//headRecurion(10);
		
		tailRecursion(10);
	}
	
	
	public static void headRecurion(int n) {
		if(n==0) return;
		headRecurion(n-1);		
		System.out.println(n);
	}
	
	public static void tailRecursion(int n) {
		if(n ==0 ) return;
		System.out.println(n-1);
		tailRecursion(n-1);
	}
	
}
