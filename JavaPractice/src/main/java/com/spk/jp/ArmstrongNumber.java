package com.spk.jp;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void armstrongNumber(int num) {
		int arm = 0, a, b, c;
		b = num;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			arm = arm + a * a * a;

		}
		if (arm == b)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Not a Armstrong");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Armstrong:: ");
		int num = sc.nextInt();
		armstrongNumber(num);

	}

}
