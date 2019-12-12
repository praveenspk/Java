
package com.spk.polymorphism;
/**
 * @author Praveen
 *
 */
class parent {

	public void property() {
		System.out.println("Gold");

	}

	public void marry() {
		System.out.println("Neelima");
	}
}

class Child extends parent {

	public void marry() {

		System.out.println("Nayanathara....");
	}
}

public class MethodHiding {

	public static void main(String[] args) {

		parent p = new parent();
		p.property();
		p.marry();

	}

}
