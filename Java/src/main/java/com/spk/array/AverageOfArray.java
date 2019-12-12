package com.spk.array;

/**
 * @author Praveen
 *
 */
public class AverageOfArray {

	static double calculateAverageOfArray(int[] inputArray) {
		double avg = 0;
		int sum = 0;

		for (int i = 0; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
		}
		avg = sum / inputArray.length;

		return avg;

	}

	public static void main(String[] args) {
		int[] inputArray = { 1, 4, 5, 6, 7, 20 };
		System.out.println("Average of an Array : " + calculateAverageOfArray(inputArray));

	}
}
