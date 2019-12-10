package com.spk.test;

public class RestrictObjectCreation_Test {

	public static void main(String args[]) {

		RestrictObjectCreation obj1 = RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj2 = RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj3 = RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj4 = RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj5 = RestrictObjectCreation.getInstance();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());

	}
}