package com.spk.jp;

import java.util.Scanner;

public class ReverseNumber {

	public static void reverseNumber(int num) {

		int rev = 0, a;
		while (num > 0) {
			a = num % 10;
			rev = rev * 10 + a;
			num = num / 10;
		}
		System.out.println("Reverse Number Is : " + rev);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Reverse :: ");
		int num = sc.nextInt();
		reverseNumber(num);
	}

}
