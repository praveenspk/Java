package com.spk.jp;

import java.util.Scanner;
/**
 * @author Praveen
 *
 */
public class PrimeNumber {

	static void primeNumber(int no){
		int i;
		if (no == 1) {
			System.out.println("Smallest Prime number is 2");
		}
		for (i = 2; i < no; i++) {
			if (no % i == 0) {
				System.out.println("Not Prime");
				break;
			}
		}
		if (no == i) {
			System.out.println("Prime");
		}

	}
	public static void main(String[] args) {

		int no;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number :");
		no = s.nextInt();
		primeNumber(no);
	}

}
