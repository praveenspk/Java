package com.huawei.javaMaster;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Diagonal_Test {

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] arr) {

		int len = arr.length;
		int leftDiagonalSum = 0;
		int rightDiagonalSum = 0;

		int index = 0;
		while (index < len) {
			leftDiagonalSum += arr[index][index];
			rightDiagonalSum += arr[index][len - 1 - index];
			index++;
		}
		System.out.println("leftDiagonalSum : " + leftDiagonalSum + "\nrightDiagonalSum :  " + rightDiagonalSum
				+ " \nDiagonalDifference : " + Math.abs(leftDiagonalSum - rightDiagonalSum));
		return Math.abs(leftDiagonalSum - rightDiagonalSum);
	}

	public static void main(String[] args) throws IOException {

		int n = 3;

		int arr[][] = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };
		System.out.println("DiagonalDifference :" + diagonalDifference(arr));
	}
}
