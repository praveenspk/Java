package com.huawei.inheritance;

interface Interface_One {
	default void anyMethod() {
		System.out.println("Hi... From Interface One");
	}
}