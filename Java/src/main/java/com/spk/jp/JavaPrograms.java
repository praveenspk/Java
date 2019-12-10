package com.spk.jp;

import java.util.Scanner;

public class JavaPrograms {

	public static void factorialNumber() {
		int fact = 1, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Facorial Number :");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial Number is:" + fact);
	}

	public static void table() {
		int table = 1, num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Number :");
		num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}

	}

	public static void main(String[] args) {

		// factorialNumber();
		table();
	}

}
