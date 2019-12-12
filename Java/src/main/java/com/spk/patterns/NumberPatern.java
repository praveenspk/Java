package com.spk.patterns;
/**
 * @author Praveen
 *
 */
public class NumberPatern {
	public static void NumberSeries(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		NumberSeries(5);
	}

}
