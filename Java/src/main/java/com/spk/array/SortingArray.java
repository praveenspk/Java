package com.spk.array;

/**
 * @author Praveen
 *
 */
public class SortingArray {

	static int[] sortArray(int[] inputArray) {
		int temp = 0;
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] > inputArray[j]) {
					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
					//System.out.println(inputArray[j]);
				}
			}
		}
		return inputArray;
	}

	public static void main(String[] args) {
		int[] array = { 40, 52, 68, 51, 12, 4, 5, 78, 95, 225, 2, 65 };
		int[] sortedArray = sortArray(array);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}

	}
}
