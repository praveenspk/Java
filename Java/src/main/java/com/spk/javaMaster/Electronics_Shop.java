package com.spk.javaMaster;

import java.io.*;
/**
 * @author Praveen
 *
 */
public class Electronics_Shop {

	/*
	 * Complete the getMoneySpent function below.
	 */
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int sum = 0;
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				int cost = keyboards[i] + drives[j];
				if (cost <= b && cost > sum) {
					sum = cost;
				}
			}
		}
		if (sum == 0) {
			return -1;
		} else {
			return sum;
		}

	}

	public static void main(String[] args) throws IOException {

		String[] bnm = { "10", "2 ", "3" };

		int b = Integer.parseInt(bnm[0]);

		int n = Integer.parseInt(bnm[1]);

		int m = Integer.parseInt(bnm[2]);

		int[] keyboards = new int[n];

		String[] keyboardsItems = {};

		for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
			int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
			keyboards[keyboardsItr] = keyboardsItem;
		}

		int[] drives = new int[m];

		String[] drivesItems = {};

		for (int drivesItr = 0; drivesItr < m; drivesItr++) {
			int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
			drives[drivesItr] = drivesItem;
		}

		/*
		 * The maximum amount of money she can spend on a keyboard and USB drive, or -1
		 * if she can't purchase both items
		 */

		int moneySpent = getMoneySpent(keyboards, drives, b);

	}
}
