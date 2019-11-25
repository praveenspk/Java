package com.huawei.utility;

public class FactorialRecursion {
	public static Long factorial(int num) {
		if (num >= 1)
			return num * factorial(num - 1);
		else
			return 1L;
	}

	public static void main(String[] args) {

		int num = 6;
		long factorial = factorial(num);
		System.out.println("Factorial of " + num + " is  : " + factorial);

	}

}
