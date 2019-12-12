package com.spk.arrays;

/**
 * @author Praveen
 *
 */
public class Even_Odd_Sum {
	public static void main(String[] args) {

		int arr[] = { 7, 3, 4, 20, 25, 29 };
		int even_arr = 0;
		int odd_arr = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even_arr = even_arr + arr[i];
			} else {
				odd_arr = odd_arr + arr[i];
			}

		}
		System.out.println("Even Sum : " + even_arr);
		System.out.println("Odd Sum : " + odd_arr);

	}

}
