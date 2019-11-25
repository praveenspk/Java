package com.spk.inheritance;

interface InterfaceOne {
	default void anyMethod() {
		System.out.println("Hi... From Interface One");
	}
}

interface InterfaceTwo extends Interface_One {
	@Override
	default void anyMethod() {
		System.out.println("Hi... From Interface Two");
	}
}

class ClassOne implements Interface_One, InterfaceTwo {
	@Override
	public void anyMethod() {
		System.out.println("Hi... From Class ");
	}
}

public class MyClass extends ClassOne implements Interface_One, InterfaceTwo {
	public static void main(String[] args) {
		new MyClass().anyMethod();
	}
}