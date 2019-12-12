package com.spk.interfaces;
/**
 * @author Praveen
 *
 */
interface Java8InterfaceDemo {

	static void prints(String str) {

		System.out.println("Static method of interface:" + str);
	}

	abstract void print();

	default void display() {

		System.out.println("default method of interface");

	}

	public static void displays() {

		System.out.println("Public method of interface");

	}

}