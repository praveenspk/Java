package com.spk.patterns;

public class NumberPatern2 {
	public static void NumberSeries(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		NumberSeries(5);
	}

}
