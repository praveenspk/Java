package com.huawei.javaMaster;

import java.security.MessageDigest;

public class EncryptionTest {

	static void get(String message) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(message.getBytes());
			byte[] hash = messageDigest.digest();

			for (byte b : hash) {
				System.out.printf("%02x", b);
			}
		} catch (Exception e) {
		}
	}

	static String encryption(String s) {
		Double a = Math.sqrt(s.length());
		System.out.println(a);
		int h = (int) Math.floor(a);
		System.out.println(h);

		int w = (int) Math.ceil(a);
		System.out.println(w);
		String str = null;
		int count = 0;
		char ar[] = s.toCharArray();

		for (int i = 0; i < w; i++) {
			int j = i;
			while (j < s.length()) {
				System.out.print(ar[j]);
				str = String.valueOf(ar);
				j += w;
				count++;
			}

			System.out.print(" ");
		}
		return str;

	}

	private static String solve(String word) {
		char[][] squareCode = encrypt(word);
		StringBuilder out = new StringBuilder();

		int maxRows = squareCode.length;
		int maxCols = squareCode[0].length;

		int row = 0;
		int col = 0;

		while (true) {
			if (row >= maxRows) {
				row = 0;
				col++;
				out.append(" ");
			}
			if (col >= maxCols) {
				break;
			}
			char c = squareCode[row][col];
			if (c == '~') {
				row++;
				continue;
			} else {
				out.append(c);
			}
			row++;
		}

		return out.toString().trim();
	}

	private static char[][] encrypt(String word) {
		int len = word.length();
		double row = Math.floor(Math.sqrt((double) len));
		double col = Math.ceil(Math.sqrt((double) len));

		// find smallest possible area where all characters fit into
		if (((int) row * col) < len) {
			double min = Math.min(row, col);
			if (min == row) {
				row++;
			} else {
				col++;
			}
		}

		char[][] squareCode = new char[(int) row][(int) col];
		int k = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (k < len) {
					squareCode[i][j] = word.charAt(k);
					k++;
				} else {
					squareCode[i][j] = '~';
				}
			}
		}
		return squareCode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Praveen";
		String word="haveaniceday";
		// System.out.println(encryption(s));
		//get(s);
		System.out.println( " " +solve(word));
		
	}

}
