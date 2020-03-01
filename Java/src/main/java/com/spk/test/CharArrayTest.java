/**
 * 
 */
package com.spk.test;

/**
 * @author Praveen
 *
 */
public class CharArrayTest {

	public static void reverseCharArray(char[] array) {

		char[] output = new char[array.length];
		for (int i = array.length - 1; i >= 0; i++) {
			// output[i]=
		}

	}

	public static char[] reverseArray(char[] input) {
		int index = 0;
		char[] reverseArr = new char[input.length];
		for (int i = input.length - 1; i >= 0; i--) {
			reverseArr[index] = input[i];
			index++;
		}
		return reverseArr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char[] JavaCharArray = { 'r', 's', 't', 'u', 'v' };
		
		System.out.println(reverseArray(JavaCharArray));
		
		
		
		for (char c : JavaCharArray) {
			// System.out.println(c);

		}

		for (int i = 0; i < JavaCharArray.length; i++) {
			if (JavaCharArray[i] % 2 == 0) {
				//System.out.println(JavaCharArray[i]);
			}
		}

	}

}
