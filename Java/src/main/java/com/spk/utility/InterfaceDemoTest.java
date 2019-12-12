package com.spk.utility;
/**
 * @author Praveen
 *
 */
public class InterfaceDemoTest extends InterfaceDemoAbstract implements InterfaceDemo {

	@Override
	public void showA() {
		System.out.println("From showA()");

	}

	@Override
	public void showB() {

		System.out.println("From showA()");
	}

	@Override
	public void display() {

		System.out.println("From display()");
	}

	public static void main(String[] args) {
		InterfaceDemoTest test = new InterfaceDemoTest();
		test.display();
		test.getMessage();
		test.showA();
		test.showB();

	}
}
