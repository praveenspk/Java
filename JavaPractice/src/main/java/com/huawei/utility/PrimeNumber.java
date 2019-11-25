package com.huawei.utility;

public class PrimeNumber {

	static void getPrimeNumber() {
		int i = 0;
		int num = 0;
		// Empty String
		String primeNumbers = "";
		int temp = 0;

		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String

				primeNumbers = primeNumbers + i + " ";
				temp = temp + i;
			}

		}

		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
		System.out.println("Prime number Sum is : " + temp);
	}

	static void isPrimeNumber(int num) {
		int temp;
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}

	}

	public static void main(String[] args) {
		getPrimeNumber();
		// isPrimeNumber(53);

	}
}
