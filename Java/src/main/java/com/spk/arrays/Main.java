package com.spk.arrays;

import java.util.*;

/**
 * @author Praveen
 *
 */
public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array :");
		int n = s.nextInt();
		int[] joey = new int[n];
		for (int i = 0; i < n; i++) {
			joey[i] = s.nextInt();
		}
		int[] aadhar = new int[n];
		aadhar = reverse(joey);
		for (int i = 0; i < aadhar.length; i++) {
			System.out.println(aadhar[i]);
		}
	}

	public static int[] reverse(int[] joey) {
		int[] bhat = new int[joey.length];
		for (int i = 0; i < joey.length; i++) {
			for (int j = joey.length - 1; j >= 0; j--)
				bhat[i] = joey[j];
		}
		return bhat;
	}

}