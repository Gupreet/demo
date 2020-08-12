package com.dct.algorithimics;

public class TaylorSeries {

	double p=1;
	double f=1;
	public static void main(String[] args) {
		TaylorSeries t = new TaylorSeries();
		System.out.println(t.e(4,15));
	}	
	
	
	double e(int x,int n){
		
	if(n == 0)
		return 1;
	else {
		double r=e(x, n-1);
		p=p*x;
		f=f*n;
		return r+p/f;
	}
		
		
	}
}
