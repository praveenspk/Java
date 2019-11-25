package com.huawei.exception;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str;

	public MyException(String string) {
		str = string;

	}

	public String toString() {
		return ("Exception Occured : " + str);

	}
}

public class CustomException {

	public static void main(String[] args) {

		try {
			System.out.println("Try block ");
			throw new MyException("My Error Page ");
		} catch (MyException e) {
			System.out.println("Catch block");
			e.printStackTrace();
		}

	}

}
