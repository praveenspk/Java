package com.spk.exception;
/**
 * @author Praveen
 *
 */
public class Main {

	// Returns the distance between the two closest numbers.
	static int distClosestNumbers(int[] numbers) {
		// try to implement it!
		return 0 ;
	}

	public static void main(String[] args) {
		String[] str= {"java check it out"};
		System.err.println(str.length);
		System.out.println(str[str.length-2]);
		
		int[] testArray = { 3, 9, 50, 15, 99, 7, 98, 65 };
		int result = distClosestNumbers(testArray);
		System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
	}
}