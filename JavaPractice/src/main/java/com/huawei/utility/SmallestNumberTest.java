package com.huawei.utility;

public class SmallestNumberTest {
	// this program finds out the smallest number which is repeated K times in a
	// given array
	public static int smallestNumber(int[] x, int repetations) {
		int max = 200;
		for (int i = 0; i < x.length; i++) {
			int count = 0;
			int element = x[i];
			for (int y : x) {
				if (element == y) {
					count = count + 1;
				}
			}
			if (repetations == count) {
				if (x[i] < max) {
					max = x[i];
				}
			}
			// System.out.println(element+" has repeated "+count+" times");
		}
		return max;
	}

	public static void main(String[] args) {
		int[] x = { 1, 1, 2, 3, 4, 4, 5, 6 };
		int repetations = 1;

		int min = smallestNumber(x, repetations);
		System.out.println("minimum number which is repeated " + repetations + " times is " + min);
	}
}