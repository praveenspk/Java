package com.spk.javaMaster;



public class PlusMinus {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		double pos = 0, neg = 0, neu = 0;
		double arr_count = arr.length;
		for (int i = 0; i < arr_count; i++) {
			if (arr[i] > 0)
				pos++;
			else if (arr[i] < 0)
				neg++;
			else if (arr[i] == 0)
				neu++;
		}
		System.out.println((pos / arr_count));
		System.out.println((neg / arr_count));
		System.out.println((neu / arr_count));

	}

	public static void main(String[] args) {

		int[] arr = { -4, 3, -9, 0, 4, 1 };

		plusMinus(arr);
	}
}
