package com.huawei.javaMaster;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BiggerIsGreater {

	// Complete the biggerIsGreater function below.
	static void biggerIsGreater(char[] str) {

		int i, flag = 0;
		loop: for (i = str.length - 1; i > 0; i--) {

			if (str[i] > str[i - 1]) {
				int j = str.length - 1;
				while (flag == 0 && j != i - 1) {
					if (str[i - 1] < str[j]) {
						char t = str[j];
						str[j] = str[i - 1];
						str[i - 1] = t;
						flag = 1;
						break loop;
					}
					j--;
				}
			}

		}

		Arrays.sort(str, i, str.length);

		if (flag == 0)
			System.out.println("no answer");
		else
			System.out.println(str);
		

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int T = 5;
		for (int TItr = 0; TItr < T; TItr++) {
			String w = scanner.nextLine();

			//String result = biggerIsGreater(w);
			//System.out.println(result);
			scanner.close();

		}
	}
}
