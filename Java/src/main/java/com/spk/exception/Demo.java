package com.spk.exception;
/**
 * @author Praveen
 *
 */
public class Demo {

	public static void main(String[] args) {
		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.exit(0);

		}/*catch (Exception e) {
			System.out.println("Exception Occured");
			e.getMessage();
		}*/ finally {
		System.out.println("Entered into Finally Block");	
		}
	}

}
