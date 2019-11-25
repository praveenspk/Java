package com.spk.test;

public class InterfaceMethods {

	interface A{
		String that="This";
		public static void printThis() {
			//String that="Hello";
			System.out.println(that);
		}
	}
	public static void main(String[] args) {
		A.printThis();
	}
}
