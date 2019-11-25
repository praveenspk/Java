package com.huawei.javaMaster;

import java.util.Scanner;

/*
If the book is returned on or before the expected return date, no fine will be charged (i.e.: .
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, .
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .
If the book is returned after the calendar year in which it was expected, there is a fixed fine of .*/

public class LibraryFine {

	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		int fine = 0;
		if ((d1 > d2 && m1 == m2 && y1 == y2))
			fine = 15 * (d1 - d2);
		if ((m1 > m2 && y1 == y2))
			fine = 500 * (m1 - m2);
		if (y1 > y2)
			fine = 10000;
		System.out.println(fine);
		return fine;
	}

	public static void main(String[] args) {

		/*
		 * Scanner in = new Scanner(System.in); int day, month, year; day =
		 * in.nextInt(); month = in.nextInt(); year = in.nextInt(); int daye, monthe,
		 * yeare; daye = in.nextInt(); monthe = in.nextInt(); yeare = in.nextInt();
		 */

		libraryFine(9, 6, 2015, 6, 6, 2015);
	}
}
