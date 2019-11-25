package com.spk.utility;

public class SmallestNumber {

	static double getSmallest(double x, double y, double z) {

		return Math.min(Math.min(x, y), z);

	}

	public static void main(String[] args) {

		System.out.println(getSmallest(452778.34, 89754520.79, 27234.9635));
	}
}
