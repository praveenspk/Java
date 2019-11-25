package com.spk.utility;

public class StaticTest {
	
	public static void display() {
		System.out.println("From static Method () ");
	}
	static {
		System.out.println("Static block");
	}
	
	public void getDisplay() {
		System.out.println("Concrete Method ()");
	}
	
	
	public static void main(String[] args) {
		StaticTest test=new StaticTest();
		test.getDisplay();
		
	}

}
