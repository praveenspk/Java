package com.spk.test;

public class Switch_Test {

	public static void main(String[] args) {
		int a = 1, b, c, d;
		switch (a = 1) {
		case 1:
			System.out.println("A=1");
		case 2:
			System.out.println("B=1");
		case 3:
			System.out.println("C=1");
		case 4:
			System.out.println("D=1");
			break;
		default:
			System.out.println("Invalid");

		}
	}
}