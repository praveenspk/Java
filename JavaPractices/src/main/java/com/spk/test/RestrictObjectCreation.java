
package com.spk.test;

// program to restrict a class from not to create more than three instances

public class RestrictObjectCreation {

	private static RestrictObjectCreation object;
	public static int objCount = 0;

	private RestrictObjectCreation() {
		System.out.println("Singleton(): Private constructor invoked");

		objCount++;
	}

	public static RestrictObjectCreation getInstance() {

		if (objCount < 3) {

			object = new RestrictObjectCreation();

		}

		return object;

	}

}
