package com.spk.array;

import java.util.Scanner;

public class SubMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = -1;
		int count1 = 0, count2 = 0, sno = 1;
		System.out.println("Enter how many rows:");
		int row = sc.nextInt();
		System.out.println("Enter how many columns:");
		int column = sc.nextInt();
		int arr[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			System.out.println("Enter " + (i + 1) + "-row elements :");
			for (int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row - 1; i++) {
			for (int j = 0; j < column - 1; j++) {
				if (arr[i][j] < arr[i][j + 1]) {
					if (start == -1) {
						start = j;
					}
					if (arr[i][j + 1] < arr[i + 1][start]) {
						count1++;
					}
				}
			}
			if (count1 >= 1) {
				for (int k = start; k < column - 1; k++) {
					if (arr[i + 1][k] < arr[i + 1][k + 1]) {
						count2++;
					} else {
						if (count2 == 0)
							start++;
						else
							break;
					}
				}
			}
			if (count2 >= 1) {
				if (count1 < count2) {
					System.out.println((sno++) + "-Sorted sub array is :");
					count1 += start;
					for (int p = i; p <= i + 1; p++) {
						for (int q = start; q <= count1; q++) {
							System.out.print(arr[p][q] + " ");
						}
						System.out.println();
					}
				} else {
					System.out.println((sno++) + "-Sorted sub array is :");
					count2 += start;
					for (int p = i; p <= i + 1; p++) {
						for (int q = start; q <= count2; q++) {
							System.out.print(arr[p][q] + " ");
						}
						System.out.println();
					}
				}
			}
			start = -1;
			count1 = 0;
			count2 = 0;
		}
	}
}