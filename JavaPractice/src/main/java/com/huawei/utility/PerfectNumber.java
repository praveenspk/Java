package com.huawei.utility;

public class PerfectNumber {

	static void isPerfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (num == sum) {
			System.out.println(num + "  is Perfect number");
		} else {
			System.out.println(num + "  is Not a Perfect number");
		}
	}

	public static void main(String[] args) {
		isPerfectNumber(7);
	}

}
