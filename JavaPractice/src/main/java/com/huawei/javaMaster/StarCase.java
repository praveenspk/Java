package com.huawei.javaMaster;

public class StarCase {

	static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i + j) > n) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	// Complete the staircase function below.
	static void staircase(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i + j) > n) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		staircase(6);
		//pattern(6);

	}
}