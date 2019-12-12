package com.spk.exception;
/**
 * @author Praveen
 *
 */
public class CNF {
	public static void main(String[] args) {
		
		ClassLoader classLoader = CNF.class.getClassLoader();
		 
		try {
			System.out.println("In Try block ");
			Class<?> aClass = classLoader.loadClass("com.huawei.exception.CustomException");
			Class.forName("com.huawei.exception.CustomException");

		} catch (Exception e) {
			System.out.println("Exception Occured At : " );
			e.printStackTrace();
		}

	}

}