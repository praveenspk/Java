package com.spk.jp;

import java.util.Scanner;

public class Fibonacci {

	public static void fib(int num) {
		int first = 0, last = 1, next;
		System.out.println("Fibonacci Series is :: ");
		for (int i = 0; i < num; i++) {
			System.out.println(first);
			next = first + last;
			first = last;
			last = next;

		}
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get Fibonacci Series: ");
		num = sc.nextInt();
		fib(num);

	}

}
