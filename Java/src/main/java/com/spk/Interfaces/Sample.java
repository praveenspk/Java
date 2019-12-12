package com.spk.Interfaces;
/**
 * @author Praveen
 *
 */
public class Sample implements Java8InterfaceDemo {

	public static void main(String[] args) {

		Sample obj = new Sample();

		obj.print(); // calling implemented method
		obj.display(); // calling inherited method
		Java8InterfaceDemo.displays(); //calling using interface name
		Java8InterfaceDemo.prints("Praveen Kumar");
	}

	@Override
	public void print() {
		System.out.println("Hello Praveen");
	}
}
