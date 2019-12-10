package com.spk.patterns;

public class Number_Pyramid {

	public static void printNum(int n) {
		int i, j, num;
		for (i = 0; i < n; i++) {
			num = 1;
			for (j = 0; j <= i; j++) {
				// printing num with a space
				System.out.print(num + " ");

				// incrementing value of num
				num++;
			}

			// ending line after each row
			System.out.println();
		}
	}

	
	public static void main(String args[]) {
		int n = 5;
		printNum(n);
		
	}
}
