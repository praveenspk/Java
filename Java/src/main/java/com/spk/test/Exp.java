package com.spk.test;
/**
 * @author Praveen
 *
 */
public class Exp {

	static int i;

	Exp() {
		i++;
	}

	public void get() {
		String[] v = { "1", "2", "3", "4", "5", "6" };
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
			// System.out.println(i);
		}
	}

	public void display() {
		System.out.println("---------------------");

		for (int i = 0; i < 5; i++) {

			System.out.println(1);
			if (i < 2)
				continue;
			else
				break;
		}
	}

	public static void main(String[] args) {
		Exp a = new Exp();
		if (a != null) {
			System.out.println("result is: " + i);
		}
		a.get();
		a.display();
	}

}
