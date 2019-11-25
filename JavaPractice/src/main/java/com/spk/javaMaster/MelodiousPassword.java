package com.spk.javaMaster;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MelodiousPassword {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Input : ");
		int n = in.nextInt();
		int index = 97;
		for (int i = 26; i > 0; i--) {
			char b = (char) index;
			if (index == 121) {
			} else
				System.out.println(b);
			index++;
		}

	}
}