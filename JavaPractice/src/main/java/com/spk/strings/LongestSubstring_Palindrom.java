package com.spk.strings;

class Solution {
	public static String longestPalindrome(String s) {
		int n = s.length();
		char[] c = s.toCharArray();
		Boolean[][] dp = new Boolean[n][n];
		int start, end;
		start = end = 0;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				if (j - i < 3) { // base case
					dp[i][j] = (c[i] == c[j]);
				} else {
					dp[i][j] = (c[i] == c[j] && dp[i + 1][j - 1]);
				}

				if (dp[i][j] && (end - start <= j - i)) {
					start = i;
					end = j;
				}
			}
		}
		return s.substring(start, end + 1);
	}
}

public class LongestSubstring_Palindrom {

	public String longestPalindrome(String s) {
		if (s == null || s.length() < 1)
			return "";
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}

	private int expandAroundCenter(String s, int left, int right) {
		int L = left, R = right;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}

	public static void main(String[] args) {

		System.out.println(Solution.longestPalindrome("abbbbbababa"));
		LongestSubstring_Palindrom palindrom = new LongestSubstring_Palindrom();
		System.out.println(" : " + palindrom.longestPalindrome("abbbbbababa"));

	}
}