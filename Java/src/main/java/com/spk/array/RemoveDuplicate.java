package com.spk.array;

/**
 * @author Praveen
 *
 */
public class RemoveDuplicate {
	public static void removeDuplicate(int[] input, int len) {
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (input[i] == input[j]) {
					input[j] = input[len - 1];
					len--;
					j--;
				} // end of if block
			} // end of inner-for loop

		} // end of outer-for loop
		for (int k = 0; k < len; k++) {
			System.out.print(input[k] + " ");
		} // end of for
	}// end of removeDuplicate(-,-) method

	public static void main(String[] args) {
		int[] input = { 0, 0, 0, 1, 2, 2, 2, 2, 4, 4, 4, 4, 1, 1, 1, 1, 5, 5, 5, 3, 7, 7, 8, 9, 9, 9, 10, 1, 1, 1 };
		int len = input.length;
		removeDuplicate(input, len);
	}// end of main(-) method
}// end of class