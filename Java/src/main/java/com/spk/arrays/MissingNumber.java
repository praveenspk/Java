package com.spk.arrays;

/**
 * @author Praveen
 *
 */
public class MissingNumber {

	static int getMissingInteger(int[] array) {

		int sum = 0;
		int actualSum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			System.out.println("Array Elements : " + sum);
		}
		// n*(n+1)/2;
		actualSum = (array.length * (array.length + 1)) / 2;

		return actualSum;

	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		System.out.println("Missing element : " + getMissingInteger(array));

	}

}
