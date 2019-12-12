package com.spk.javaMaster;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Praveen
 *
 */
public class Alice_Bob_Solution {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int A = 0, B = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				A++;
			} else if (a.get(i) < b.get(i)) {
				B++;
			}
		}
		System.out.println("Alice : " + A + "\n" + "Bob : " + B);
		System.out.println(Arrays.asList(A, B));
		return Arrays.asList(A, B);
	}

	public static void main(String[] args) throws IOException {

		String[] aItems = { "17", "28", "30" };

		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a.add(aItem);
		}

		String[] bItems = { "99", "16", "8" };

		List<Integer> b = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			int bItem = Integer.parseInt(bItems[i]);
			b.add(bItem);
		}

		List<Integer> result = compareTriplets(a, b);
		System.out.println(Arrays.asList(result));
		/*
		 * for (int i = 0; i < result.size(); i++) { System.out.println(result.get(i));
		 * if (i != result.size() - 1) { System.out.println(" "); } }
		 * 
		 */	}
}
