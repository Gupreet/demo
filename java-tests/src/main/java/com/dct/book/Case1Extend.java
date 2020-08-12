package com.dct.book;

public class Case1Extend extends Case1 {

	public static void main(String[] args) {
		new Case1Extend().go();
	}
	
	
	
	private void go() {
		blastoff();
	
	}
	private void blastoff()
	{
		System.out.println("sh-bang ");
	}
}
