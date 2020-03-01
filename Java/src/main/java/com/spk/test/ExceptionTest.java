/**
 * 
 */
package com.spk.test;

/**
 * @author Praveen
 *
 */
public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionTest obj = new ExceptionTest();
		//obj.sum(200, 200);// now ambiguity

	}

	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

}
