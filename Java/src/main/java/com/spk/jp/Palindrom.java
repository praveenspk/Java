package com.spk.jp;

public class Palindrom {

	public static void palindrom(int num) {

		int a, b, temp = 0;
		b = num;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			temp = temp * 10 + a;

		}
		if (b == temp)
			System.out.println("Number is Palindrom");
		else
			System.out.println("Not a palindrom");

	}

	public static void main(String[] args) {
		palindrom(1551);

	}

}
