package com.dct.doublecolon;

public class ExampleOne {

	public static void m1() {
		System.out.println("static method implementation");
	}
	
	public void my() {
		System.out.println("instance method implementation");
	}
	
	public static void main(String[] args) {

		Interf i =ExampleOne::m1;
		i.m2();
		
		Interf i2=new ExampleOne()::my;
		i2.m2();
	}
	
	
}
