package com.spk.statics;

public class StaticClass {

	static String str = "Static class";

	public StaticClass() {
		super();
		System.out.println("Calling from constructor : ");
	}

	public static class StaticDemo {
		static void dislay() {
			System.out.println(str);
		}

	}

	public static void main(String[] args) {
		StaticClass.StaticDemo cls = new StaticClass.StaticDemo();
		cls.dislay();

	}

}
