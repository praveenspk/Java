package com.spk.test;


/**
 * @author Praveen
 *
 */
public class Sample {

	void add(int a) {
		System.out.println("a");
	}
	void add(int... b) {
		System.out.println("b");
	}
	public static void main(String[] args) {
	new Sample().add(5,5);
		
	}

}
