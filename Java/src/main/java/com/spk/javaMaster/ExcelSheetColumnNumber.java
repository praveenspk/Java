package com.spk.javaMaster;
/**
 * @author Praveen
 *
 */
public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		ExcelSheetColumnNumber number = new ExcelSheetColumnNumber();
		Solution sol = number.new Solution();
		System.out.println(sol.titleToNumber("Hello"));

	}

	public class Solution {
		public int titleToNumber(String s) {
			int n = 0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				n = n * 26 + c - 'A' + 1;
			}
			return n;
		}
	}

	public static class UnitTest {

	}
}