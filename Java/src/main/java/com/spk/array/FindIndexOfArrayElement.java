package com.spk.array;

/**
 * @author Praveen
 *
 */

public class FindIndexOfArrayElement {

	static int getIndexOfArray(int[] inputArray, int element) {
		int pos = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == element) {
				System.out.println(element + " Index at " + i);
				pos = i;
			} else {
				System.out.println();
			}

		}

		return pos;

	}

	public static void main(String[] args) {

		int[] inputArray = { 1, 4, 5, 6, 7, 20 };
		int element = 6;
		System.out.println(getIndexOfArray(inputArray, element));

	}
}
