
package com.spk.jp;

public class OddSquare {

	public static int findOddSquare(int num) {
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (i % 2 != 0) {
				count = count + i * i;
				num = num + 1;

			}
		}

		return count;
	}

	static int findSquare(int num) {
		int math = 0;
		for (int i = 1; i < num; i++) {
			if (i % 2 != 0) {

				math = math + (int) (Math.pow(i, i));
			}

		}
		return math;

	}

	public static void main(String[] args) {

		System.out.println("The Odd Number Square Is :: " + findOddSquare(5));
		System.out.println("The Odd Number Square Is :: " + findSquare(7));

	}

}
