package com.spk.strings;

import java.util.Arrays;

public class SmallDigit {

	static int smallDigit(int num) {
		int smallNum;
		String[] data = String.valueOf(num).split("");
		Arrays.sort(data);
		smallNum = (Integer.valueOf(data[0]) * 100) - 1;

		return smallNum;
	}

	public static void main(String[] args) {

		System.out.println(smallDigit(896));
		System.out.println(smallDigit(345));
		
	}

}
