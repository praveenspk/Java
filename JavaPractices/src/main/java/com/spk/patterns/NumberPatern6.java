package com.spk.patterns;

public class NumberPatern6 {
	public static void NumberSeries(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = i; j <=num ; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		NumberSeries(5);
	}

}
