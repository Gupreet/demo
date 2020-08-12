package com.dct.doublecolon;

public class ThreadExample {

	public static void myMethod() {
		for (int i = 0; i < 10; i++)
			System.out.println("child thread");
	}
	
	public static void main(String[] args) {
		
		Thread t=new Thread(ThreadExample::myMethod);
		t.start();
		
		for (int i = 0; i < 10; i++)
			System.out.println("main thread");
		
		
		
		
	}
	
}
