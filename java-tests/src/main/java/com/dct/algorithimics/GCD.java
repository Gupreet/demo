package com.dct.algorithimics;

public class GCD {

	
	public static void main(String[] args) {
		System.out.println(findIteratebly(10,100));
		System.out.println(findRecurisevly(10,100));
	}
	
	private static int findIteratebly(int num1,int num2){
		
		while(num2 !=0) {
			int temp=num2;
			num2=num1%num2;
			num1=temp;			
		}
		
		return num1;
		
	}
	
    private static int findRecurisevly(int num1,int num2){
		
    	if(num2 == 0)return num1;
    	
    	return findRecurisevly(num2,num1%num2);
	}
}
