package com.spk.arrays;

/**
 * @author Praveen
 *
 */
public class FindElementInArray {

	static int getElementInArray(int[] array, int element) {

		int foundElement = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				foundElement = i;
				System.out.println(element + " Element found at index : " + i);
			}

		}

		return foundElement;

	}

	public static void main(String[] args) {
		int[] inputArray = { 1, 4, 5, 6, 7, 20 };
		int element = 6;
		System.out.println(getElementInArray(inputArray, element));

	}

}
