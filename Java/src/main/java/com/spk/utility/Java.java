package com.spk.utility;

/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

class Java {
	public static void main(String[] args) throws IOException {
		try {
			@SuppressWarnings("resource")
			Scanner reader = new Scanner(System.in);
			int t = reader.nextInt();
			while (t-- > 0) {
				int n = reader.nextInt();
				int q = reader.nextInt();
				int a[] = new int[n];
				int b[] = new int[q];
				for (int i = 0; i < n; i++) {
					a[i] = reader.nextInt();
				}
				for (int i = 0; i < q; i++) {
					b[i] = reader.nextInt();
					for (int j = 0; j < n; j++) {
						b[i] = b[i] / a[j];
					}
				}
				for (int i = 0; i < q; i++) {
					System.out.print(b[i] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
		}
		finally {
			
		}
	}

}


/*
 * Input: 2 2 3 2 3 5 100 8 3 2 2 2 2 16 8 Output: 0 16 1 2 1
 */