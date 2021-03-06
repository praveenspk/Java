package com.spk.javaMaster;

import java.util.Scanner;
/**
 * @author Praveen
 *
 */
public class CutTheSticks {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		final int N = in.nextInt();

		// Add all the stick lengths to an array of size 1000 since no of elements can't
		// be
		// more than 1000 as per constraints. Other option would be to add it in a
		// sorted list or map
		// but that will require O(nlogn) time complexity in most cases.
		final int[] sticks = new int[1000];
		for (int i = 0; i < N; i++) {
			final int stickLen = in.nextInt();
			sticks[stickLen]++;
		}

		// Iterate over the sticks array and for each positive no of sticks, reduce the
		// remaining sticks by that count.
		int remainingSticks = N;
		System.out.println(remainingSticks);
		for (int i = 0; i < sticks.length; i++) {
			if (sticks[i] > 0) {
				remainingSticks -= sticks[i];
				if (remainingSticks == 0) {
					break;
				}
				System.out.println(remainingSticks);
			}
		}

		in.close();
	}
}