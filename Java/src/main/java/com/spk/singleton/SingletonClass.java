package com.spk.singleton;

/*
 * Singleton Design pattern
 * It wont allow class to be sub classed.
 * It wont allow to create object outside the class.
 * If All Constant methods is there in our class we can use private constructor.
 * If all methods are static then we can use private constructor.
*/
public class SingletonClass {

	private static SingletonClass object;

	private SingletonClass() {
		System.out.println("Singleton(): Private constructor invoked");
	}

	public static SingletonClass getInstance() {

		if (object == null) {

			System.out.println("getInstance(): First time getInstance was called and object created !");
			object = new SingletonClass();

		}

		return object;

	}

}
