package com.spk.inheritance;

interface Interface_One {
	default void anyMethod() {
		System.out.println("Hi... From Interface One");
	}
}