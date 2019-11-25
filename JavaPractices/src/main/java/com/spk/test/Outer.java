package com.spk.test;

public class Outer {
	static class NestedInner {

		public static void main(String[] args) {
			System.out.println("inside main method of Nested class"+args);

		}// inner main
	}// NestedInner

	public static void main(String[] args) {

		NestedInner.main(new String[1]);// **calling of Main method**
		System.out.println("Hello World!");
	}// outer main
}// Outer