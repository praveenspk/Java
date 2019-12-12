package com.spk.patterns;
/**
 * @author Praveen
 *
 */
public class Alpha {

	public static void AlphaSeries() {

		for (int i = 1; i < 5; i++) {
			int alphabet = 65;
			for (int j = 1; j <= i; j++) {
				System.out.print((char) alphabet);
				alphabet++;
			}
			System.out.println();
		}

	}

	public static void AlphaPattern() {
		int alphabet = 65;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) alphabet);
				alphabet++;
			}
			System.out.println();
		}

	}

	public static void AlphaReverse() {
		for (int i = 1; i < 5; i++) {
			int alphabet = 65;
			for (int j = i; j <= 5; j++) {
				System.out.print((char) alphabet);
				alphabet++;
			}
			System.out.println();
		}
	}

	public static void AlphaPyramid() {
		int alphabet = 65;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) alphabet);
			}
			System.out.println();
			alphabet++;

		}

	}

	public static void main(String[] args) {
		System.out.println("Series is::" + " ");
		AlphaSeries();
		System.out.println("Series is::" + " ");
		AlphaPattern();
		System.out.println("Series is::" + " ");
		AlphaReverse();
		System.out.println("Pyramid  is::" + " ");
		AlphaPyramid();
	}
}
