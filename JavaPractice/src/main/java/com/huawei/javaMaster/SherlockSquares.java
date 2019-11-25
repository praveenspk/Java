package com.huawei.javaMaster;

import java.util.Scanner;

public class SherlockSquares {

	static int squares(int a, int b) {

		int count = 0;

		int start = (int) Math.sqrt(a);
		int end = (int) Math.sqrt(b);

		for (int i = start; i <= end; i++) {
			long l = (i * i);
			if (l >= a && l <= b) {
				count++;
			}
		}
		System.out.println(count);

		return count;

	}

	public static void main(String[] args) {// Math.sqrt()

		squares(17, 24);
	}
}