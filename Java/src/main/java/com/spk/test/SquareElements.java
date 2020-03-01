/**
 * 
 */
package com.spk.test;

/**
 * @author Praveen
 *
 */
public class SquareElements {

	public static void getSquareCube(int[] input) {

		for (int i = 0; i < input.length; i++) {

			if ((i + 1) % 2 == 0) {
				input[i] = (int) Math.pow(input[i], 2);

			} else {
				input[i] = (int) Math.pow(input[i], 3);

			}
		}
		printArr(input, input.length);
	}

	static void printArr(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.println(arr[i] + " ");
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4 };
		System.out.println();
		getSquareCube(array);

	}
}
