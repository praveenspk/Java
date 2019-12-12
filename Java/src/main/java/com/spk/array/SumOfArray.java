package com.spk.array;

/**
 * @author Praveen
 *
 */
public class SumOfArray {

	static int sumOfArray(int[] array) {

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		return sum;

	}

	public static void main(String[] args) {

		int[] inputArray = { 1, 4, 1, 6, 7, 20 };
		System.out.println("Sum of an array : " + sumOfArray(inputArray));

	}

}
