package com.spk.test;
/**
 * @author Praveen
 *
 */
 class PrintWithoutLoop {

	public static void recursivefun(int n) {

		if (n <= 10) {

			System.out.println(n);
			recursivefun(n + 1);
		}
	}

	public static void main(String args[]) {

		recursivefun(1);

	}

}