package com.spk.patterns;
/**
 * @author Praveen
 *
 */
public class PascalTriangle {
	public static void PrintPascal(int num) {
		int bin, p, r, q, x;
		r=num;
		bin = 1;
		q = 0;

		System.out.print("Pascal's Triangle: ");
		System.out.println();
		while (q < r) {
			for (p = 40 - 3 * q; p > 0; --p)
				System.out.print(" ");
			for (x = 0; x <= q; ++x) {
				if ((x == 0) || (q == 0))
					bin = 1;
				else
					bin = (bin * (q - x + 1)) / x;
				System.out.print("      ");
				System.out.print(bin);
			}

			System.out.println("");
			++q;
		}
	}

	public static void main(String[] args) {

		PrintPascal(5);
	}

}
