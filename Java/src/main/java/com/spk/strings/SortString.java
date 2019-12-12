package com.spk.strings;

import java.util.Scanner;
/**
 * @author Praveen
 *
 */
public class SortString {

	static String[] sortString(String[] str, int count) {
		int result;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				result = str[i].compareToIgnoreCase(str[j]);
				if (result < 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}
			}
		}

		return str;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count, i;
		System.out.println("How many Character's you want to enter : ");
		count = sc.nextInt();
		String str[] = new String[count];

		System.out.println("Sorting Character's ::");
		for (i = 0; i < count; i++) {
			str[i] = sc.nextLine();
		}
		String str1[] = sortString(str, count);

	}

}
