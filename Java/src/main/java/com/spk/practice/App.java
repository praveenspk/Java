package com.spk.practice;

/**
 * @author Praveen
 *
 */
public class App {
	
	static {
		int x=-4;
		System.out.println(x>>1);
	}
	
	public static void main(String[] args) {

		int a = 20;
		String s = "sa";
		a = a++ + a++;
		System.out.println("Hello World!" + a + s);
	}
}
