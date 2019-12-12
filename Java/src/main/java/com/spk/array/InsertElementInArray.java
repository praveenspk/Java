package com.spk.array;

/**
 * @author Praveen
 *
 */
public class InsertElementInArray {

	static void insertElement(int arraysize, int pos, int element) {
		int[] inputArray = new int[arraysize];

		for (int i = 0; i < inputArray.length; i++) {
			if (i == pos) {
				inputArray[i] = element;
			}

			System.out.println(inputArray[i]);

		}

	}

	public static void main(String[] args) {

		insertElement(10, 5, 20);

	}
}
