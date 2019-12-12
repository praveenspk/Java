/**
 * 
 */
package com.spk.arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Praveen
 *
 */
public class ReverseIntegerArray {

	static Integer[] reverseArray(Integer[] inputArray) {

		Arrays.sort(inputArray, Collections.reverseOrder());

		return inputArray;
	}

	public static void main(String[] args) {

		Integer[] array = { 40, 52, 68, 51, 12, 4, 5, 78, 95, 225, 2, 65 };
		Integer[] reverseArray = reverseArray(array);
		System.out.println(" Reversed Integer Array : " + Arrays.toString(reverseArray));

	}

}
