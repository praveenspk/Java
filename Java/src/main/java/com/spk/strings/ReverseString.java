package com.spk.strings;

import java.util.Scanner;

public class ReverseString {

	static String reverseString(StringBuffer sb) {
		StringBuffer sb1 = new StringBuffer(" ");
		for (int i = sb.length() - 1; i >= 0; i--) {

			sb1 = sb1.append(sb.charAt(i));
		}

		return sb1.toString();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Revesre : ");
		StringBuffer str = new StringBuffer(sc.nextLine());
		String s = reverseString(str);
		System.out.println("Before String Reverse :" + str);
		System.out.println("After String Reverse :" + s);

	}

}
