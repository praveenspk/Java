package com.spk.javaMaster;

import java.util.Scanner;

public class FindDigits {
	static int findDigits(int n) {
		int result = 0;
		int num = n;
		while (num > 0) {
			int digit = num % 10;
			if (digit != 0 && n % digit == 0) {
				result += 1;
			}
			num = num / 10;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(findDigits(1012));

	}

}
