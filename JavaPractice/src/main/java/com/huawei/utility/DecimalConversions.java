package com.huawei.utility;

import java.util.Scanner;

public class DecimalConversions {

	static void decimalToBinary() {
		Integer decimal = 25;
		Integer binary = null;
		System.out.println("decimal : " + decimal + " Binary : " + Integer.toBinaryString(decimal));

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number : ");
		int num = input.nextInt();
		System.out.println("Method 1 : decimal To  " + num + " Binary : " + Integer.toBinaryString(num));

		int rem;
		String str2 = "";
		// Digits in binary number system
		char hex[] = { '0', '1' };

		while (num > 0) {
			rem = num % 2;
			str2 = hex[rem] + str2;
			num = num / 2;
		}
		System.out.println("Method 2: Decimal to Binary: " + str2);

	}

	static void decimalToOctal() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number : ");
		int num = input.nextInt();
		System.out.println("Method 1 : decimal to " + num + " Octal : " + Integer.toOctalString(num));

		int rem;
		String str2 = "";
		// Digits in hexadecimal number system
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7' };

		while (num > 0) {
			rem = num % 8;
			str2 = hex[rem] + str2;
			num = num / 8;
		}
		System.out.println("Method 2: Decimal to Octal: " + str2);

	}

	static void decimalToHexaDecimal() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number : ");
		int num = input.nextInt();
		System.out.println("Method 1 : decimal to " + num + " Hexa : " + Integer.toHexString(num));

		int rem;
		String str2 = "";
		// Digits in hexadecimal number system
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		while (num > 0) {
			rem = num % 16;
			str2 = hex[rem] + str2;
			num = num / 16;
		}
		System.out.println("Method 2: Decimal to hexadecimal: " + str2);

	}

	static void binaryToDecimal() {

		String binary = "1011111";

		System.out.println("Binary to Decimal Value : " + Integer.parseInt(binary, 2));
		System.out.println("Binary to Octal Value : " + Integer.parseInt(binary, 8));
		System.out.println("Binary to Hexa-Decimal Value : " + Integer.parseInt(binary, 16));

	}

	public static void main(String[] args) {

		decimalToBinary();
		decimalToOctal();
		decimalToHexaDecimal();
		System.out.println("======================================");
		binaryToDecimal();

	}

}
