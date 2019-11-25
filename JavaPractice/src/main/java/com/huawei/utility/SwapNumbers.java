package com.huawei.utility;

public class SwapNumbers {
	static void getSwapNumber(int x, int y) {
		/*
		 * Method 1 : x = x + y; y = x - y; x = x - y;
		 */

		// Method 2 :
		x = x ^ y ^ (y = x);
		System.out.println("x=" + x + "y=" + y);

	}

	public static void main(String[] args) {
		getSwapNumber(20, 30);

	}

}
