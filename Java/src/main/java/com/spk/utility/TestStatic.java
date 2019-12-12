package com.spk.utility;
/**
 * @author Praveen
 *
 */
public class TestStatic {

	static String name = "Huawei";

	static void getData() {
		for (int i = 0; i < 10; i++) {
			System.err.println(i);
		}
	}

	public static void main(String[] args) {
		getData();
		System.out.println(name + " " + TestStatic.name);

	}

}
