/**
 * 
 */
package com.spk.test;

/**
 * @author Praveen
 *
 */
public class PrintNumbersInWords {

	static void printNumberWords() {

		for (int i = 0; i <= 10; i++) {

		}
	}

	static void getSumHighest(int[] input) {

		int highest = 0;
		for (int i = 0; i <= input.length; i++) {
			if (input[i] > (input[i + 1])) {
				highest = input[i];
				System.out.println(highest);

			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 1000, 10, 45, 21, 87, 120, 658 };
		getSumHighest(input);
	}

}
