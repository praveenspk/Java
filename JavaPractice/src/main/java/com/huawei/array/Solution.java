package com.huawei.array;

import java.util.Arrays;

public class Solution {

	static {

		String str[] = { "Huawei ", "Nokia ", "Ericson ", "Samsung " };
		Arrays.sort(str);
		for (String string : str) {
			System.out.println(string);
		}
		StringBuilder sb = new StringBuilder();
		sb.append(str);

		StringBuilder s=sb.reverse();
		System.out.println("Reverse Order : ");

		
	}

	public static void main(String[] args) {

	}

}
