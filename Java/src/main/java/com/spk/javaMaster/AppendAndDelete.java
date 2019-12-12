package com.spk.javaMaster;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * @author Praveen
 *
 */
public class AppendAndDelete {

	static String appendAndDelete(String s, String t, int k) {
		int j = 0;
		for (int i = 0; i < Math.min(t.length(), s.length()); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				break;
			} else {
				j++;
			}
		}

		if ((s.length() + t.length() - 2 * j) > k) {

			return "No";
		}

		if ((s.length() + t.length() - 2 * j) % 2 == k % 2) {

			return "Yes";
		}

		if (s.length() + t.length() < k) {
			return "Yes";
		}

		return "No";

	}

	public static void main(String[] args) throws IOException {

		String s = "hackerhappy";
		String t = "hackerrank";
		int k = 9;
		System.out.println(appendAndDelete(s, t, k));

	}
}
