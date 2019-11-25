package com.spk.javaMaster;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Utopian_Tree {

	// Complete the utopianTree function below.
	static int utopianTree(int n) {
		int h = 1;
		if (n == 0)
			return h;
		while (n > 0) {
			if (n > 0) {
				h = h * 2;
				n--;
			}
			if (n > 0) {
				h = h + 1;
				n--;
			}
		}
		return h;
	}

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		int T = reader.nextInt();
		for (int i = 0; i < T; i++) {
			int N = reader.nextInt();
			System.out.println(utopianTree(N));

		}
	}
}