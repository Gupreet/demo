package com.dct.exception;

import java.io.IOException;
import java.sql.SQLException;

public class MyException extends  Exception {

	public MyException() {
		super();
	}
	
	
	public MyException(String s) {
		super(s);
	}
	
}
