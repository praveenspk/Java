package com.huawei.javaMaster;

import java.util.ArrayList;
import java.util.Arrays;

public class GrayCode {

	public static void main(String[] args) {
		System.out.println(grayCode(5));
	}

	public static ArrayList<Integer> grayCode(int n) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < (1 << n); i++) {
			ans.add(i ^ (i >> 1));
		}
		return ans;
	}

	public static int candy(int[] ratings) {
		int n = ratings.length;
		int[] candies = new int[n];
		Arrays.fill(candies, 1);
		for (int k = 1, i = 1; i < n; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candies[i] = ++k;
			} else {
				k = 1;
			}
		}
		for (int k = 1, i = n - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				candies[i] = Math.max(candies[i], ++k);
			} else {
				k = 1;
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			count += candies[i];
		}
		return count;
	}
}
