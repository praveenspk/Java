package com.spk.patterns;
/**
 * @author Praveen
 *
 */
public class NumberPatern3 {
	public static void NumberSeries(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("*");
				} else
					System.out.println(i + " ");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {

		NumberSeries(5);
	}

}
