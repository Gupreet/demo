package com.dct.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class TestException {
	
	//static int a=10/0;
	//ExceptionInInitializerError
	
	public static void main(String[] args) throws Exception {

	
		try (MyAutoClosableClass autoClosableClass = new MyAutoClosableClass()){
			 ExceptionTestJob.myJob();

			//throw new InterruptedException();
		}

/*		
		catch (Exception e) {
			System.out.println(3);

		}
		catch (Throwable e) {
			System.out.println(4);
		}*/
		

	}
}
