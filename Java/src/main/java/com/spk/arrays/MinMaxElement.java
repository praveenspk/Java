package com.spk.arrays;

import java.util.Arrays;

/**
 * @author Praveen
 *
 */
public class MinMaxElement {

	static void findMinMax(int[] inputArray) {
		int min = 0;
		int max = 0;
		Arrays.sort(inputArray);
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
			if (inputArray[i] > 0) {
				max = inputArray[inputArray.length - 1];
				min = inputArray[0];
			}
		}
		System.out.println("Minimum and maximum elements in an  Array : " + min + " and " + max);

	}

	public static void main(String[] args) {
		int[] array = { 40, 52, 68, 51, 12, 4, 5, 78, 95, 225, 2, 65 };
		findMinMax(array);

	}
}
