package com.spk.singleton;

public enum EnumSingleton {

	INSTANCE;

	public static void doSomething() {
		System.out.println("Singleton");
	}

	public static void main(String[] args) {
		doSomething();

	}
}
