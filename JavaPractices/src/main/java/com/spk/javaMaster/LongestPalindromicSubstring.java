package com.spk.javaMaster;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		LongestPalindromicSubstring palindrom = new LongestPalindromicSubstring();
		Solution sol = palindrom.new Solution();

		System.out.println(sol.longestPalindrome("mom"));
	}

	public class Solution {
		public String longestPalindrome(String s) {
			String t = "^#";
			for (int i = 0; i < s.length(); i++) {
				t += s.charAt(i);
				t += '#';
			}
			t += '$';

			int[] p = new int[t.length()];
			int id = 1;
			p[1] = 1;
			int rightIndex = 2;
			for (int i = 2; i < t.length() - 1; i++) {
				if (rightIndex > i) {
					p[i] = Math.min(p[2 * id - i], rightIndex - i);
				} else {
					p[i] = 1;
				}
				while (t.charAt(i + p[i]) == t.charAt(i - p[i])) {
					p[i]++;
				}
				if (rightIndex < i + p[i]) {
					rightIndex = i + p[i];
					id = i;
				}
			}

			int maxId = 1;
			for (int i = 2; i < t.length() - 1; i++) {
				if (p[maxId] < p[i]) {
					maxId = i;
				}
			}

			int length = p[maxId] - 1;
			int startIndex = (maxId - p[maxId]) / 2;
			return s.substring(startIndex, startIndex + length);
		}
	}
}
