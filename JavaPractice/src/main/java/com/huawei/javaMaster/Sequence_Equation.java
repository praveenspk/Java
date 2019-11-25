package com.huawei.javaMaster;

import java.util.Scanner;

public class Sequence_Equation {
	
	 static int[] permutationEquation(int[] p) {
		
		 
		 return p;


	    }

	public static void main(String[] args) {
		/* Create function: p_inverse */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] p_inverse = new int[n + 1];
		for (int x = 1; x <= n; x++) {
			int px = scan.nextInt();
			p_inverse[px] = x;
		}
		scan.close();

	
	}
}