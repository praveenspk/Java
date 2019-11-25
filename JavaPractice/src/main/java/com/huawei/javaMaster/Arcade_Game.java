package com.huawei.javaMaster;

import java.io.*;

public class Arcade_Game {

	// Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		return alice;

	}


	public static void main(String[] args) throws IOException {

		int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
		int[] alice = { 5, 25, 50, 120 };

		int[] result = climbingLeaderboard(scores, alice);

		for (int i = 0; i < result.length; i++) {
			System.out.println(String.valueOf(result[i]));

			if (i != result.length - 1) {
				System.out.println();
			}
		}
	}
}
