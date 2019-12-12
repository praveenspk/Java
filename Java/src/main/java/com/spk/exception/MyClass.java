package com.spk.exception;
/**
 * @author Praveen
 *
 */
public class MyClass {

	public static void main(String[] args) {

		System.out.println(hello("Praveen kumar...!!!"));
	}
	
private static String hello(String Name){
	try{
		return "Hello";
	}
	finally{
		return Name;
		
	}
}
}
