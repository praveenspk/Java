package com.spk.patterns;
/**
 * @author Praveen
 *
 */
public class NumberPatern5 {
	public static void NumberSeries(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = i; j <=num ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		NumberSeries(5);
	}

}
