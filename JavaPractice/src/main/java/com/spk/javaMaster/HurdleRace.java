package com.spk.javaMaster;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HurdleRace {

	// Complete the hurdleRace function below.
	static int hurdleRace(int k, int[] height) {
		int max = height[0];
		int ans;
		for (int i = 1; i < height.length - 1; i++) {
			if (height[i] > max)
				max = height[i];
		}
		if (max >= k) {
			ans = max - k;
		} else
			ans = 0;
		return ans;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int k = 4;
		int[] height = { 1, 6, 3, 5, 2 };
		int result = hurdleRace(k, height);
		System.out.println(result);
	}
}
