package com.spk.utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

	/*
	 * Complete the 'pickingNumbers' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	// Using List
	public static int pickingNumbers(List<Integer> a) {
		int[] freqs = new int[101];
		for (Integer i : a)
			freqs[i]++;
		int max = 0;
		for (int i = 1; i < freqs.length - 1; i++)
			if (freqs[i] + freqs[i + 1] > max)
				max = freqs[i] + freqs[i + 1];
		return max;
	}

	// Arrays
	static int pickingNumbers(int[] a) throws NullPointerException {
		int[] count = new int[a.length - 1];
		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(a[i]);
			for (int j = i + 1; j < a.length; j++) {
				if (Math.abs(a[i] - a[j]) == 0 || Math.abs(a[i] - a[j]) == 1) {
					arr.add(a[j]);
				}

			}
			count[i] = arr.size();
		}
		Arrays.sort(count);
		return count[count.length - 1];
	}

}

public class PickingNumbers {
	public static void main(String[] args) throws IOException,ArithmeticException {

		/*
		 * int[] a = { 4, 6, 5, 3, 3, 1 }; int result = Result.pickingNumbers(a);
		 * System.out.println(result);
		 */

		try {
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		List<Integer> a = new ArrayList<>();
		a.add(4);
		a.add(6);
		a.add(5);
		a.add(3);
		a.add(3);
		a.add(1);
		int result = Result.pickingNumbers(a);
		System.out.println(result);

	}
}
