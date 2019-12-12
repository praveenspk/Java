package com.spk.utility;

import java.util.Scanner;
/**
 * @author Praveen
 *
 */
public class Circular_Matrix {
	static void spiralPrintingAntiClockwise(int n) {

		int[][] spiral = new int[n][n];

		int value = 1;

		int minCol = 0;

		int maxCol = n - 1;

		int minRow = 0;

		int maxRow = n - 1;

		System.out.println("Anti-clockwise Spiral printing : ");
		while (value <= n * n) {
			for (int i = minRow; i <= maxRow; i++) {
				spiral[i][minCol] = value;

				value++;
			}

			for (int i = minCol + 1; i <= maxCol; i++) {
				spiral[maxRow][i] = value;

				value++;
			}

			for (int i = maxRow - 1; i >= minRow; i--) {
				spiral[i][maxCol] = value;

				value++;
			}

			for (int i = maxCol - 1; i >= minCol + 1; i--) {
				spiral[minRow][i] = value;

				value++;
			}

			minCol++;

			minRow++;

			maxCol--;

			maxRow--;
		}

		for (int i = 0; i < spiral.length; i++) {
			for (int j = 0; j < spiral.length; j++) {
				System.out.print(spiral[i][j] + "\t");
			}

			System.out.println();
		}
	}

	static void spiralPrintingClockwise(int n) {
		int A[][] = new int[n][n];
		int k = 1, c1 = 0, c2 = n - 1, r1 = 0, r2 = n - 1;
		System.out.println("Clockwise Spiral printing : ");

		while (k <= n * n) {
			for (int i = c1; i <= c2; i++) {
				A[r1][i] = k++;
			}

			for (int j = r1 + 1; j <= r2; j++) {
				A[j][c2] = k++;
			}

			for (int i = c2 - 1; i >= c1; i--) {
				A[r2][i] = k++;
			}

			for (int j = r2 - 1; j >= r1 + 1; j--) {
				A[j][c1] = k++;
			}

			c1++;
			c2--;
			r1++;
			r2--;
		}

		/* Printing the Circular matrix */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();

		spiralPrintingClockwise(n);
		spiralPrintingAntiClockwise(n);
	}
}