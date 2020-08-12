package com.dct.exception;

public class ExceptionTestJob {

	public static void myJob() throws MyException {
		/*for (int i = 0; i <10 ; i++) {
			System.out.println(i);
			
		}*/
	throw new MyException("user defined exception");
	}
	
	
}
