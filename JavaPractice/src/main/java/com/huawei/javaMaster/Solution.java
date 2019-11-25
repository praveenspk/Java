package com.huawei.javaMaster;

import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		byte testCases;
		int number;
		Scanner sc = new Scanner(System.in);
		testCases = sc.nextByte();
		while (testCases-- > 0) {
			number = sc.nextInt();
			System.out.println(findDigits(number));
		}
	}

	public static int findDigits(int number) {
		int numCopy = number, divisorCount = 0;
		;
		while (numCopy != 0) {
			int r = numCopy % 10;
			if (r != 0 && number % r == 0)
				divisorCount++;
			numCopy /= 10;
		}
		return divisorCount;
	}
}