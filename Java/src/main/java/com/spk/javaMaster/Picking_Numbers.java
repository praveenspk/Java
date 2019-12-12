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
class Result {

	/*
	 * Complete the 'pickingNumbers' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static int pickingNumbers(List<Integer> a) {

		return 0;

	}

}

public class Picking_Numbers  {

	public static void main(String[] args) throws IOException {
		int n = 6;

		String[] aTemp = { "4", "6", "5", "3", "3", " 1" };

		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aTemp[i]);
			a.add(aItem);
		}

		int result = Result.pickingNumbers(a);
		System.out.println(result);
	}
}
