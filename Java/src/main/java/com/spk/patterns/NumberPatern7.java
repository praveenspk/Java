package com.spk.patterns;
/**
 * @author Praveen
 *
 */
public class NumberPatern7 {
	public static void NumberSeries(int num) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=num ; j++) {
				System.out.print(j + " ");
			}
			num--;
			System.out.println();
		}
	}

	public static void main(String[] args) {

		NumberSeries(5);
	}

}
