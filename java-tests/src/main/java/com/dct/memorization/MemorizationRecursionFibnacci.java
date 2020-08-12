package com.dct.memorization;
public class MemorizationRecursionFibnacci {

	public static void main(String[] args) {
    
	System.out.println(fib(10));
	}

	
	
	
	private static int fib(int n) {
		int[] mem=new int[1000];
		
		
		if(n<=1)
			return n;
		else if(mem[n] != 0)
			return mem[n];	
		else
			mem[n]= fib(n-1)+fib(n-2);
		
		return mem[n];

	}
}
