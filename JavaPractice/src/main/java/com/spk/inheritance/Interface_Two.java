package com.spk.inheritance;

interface Interface_Two extends Interface_One {
	@Override
	default void anyMethod() {
		System.out.println("Hi... From Interface Two");
	}
}