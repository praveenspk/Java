package com.huawei.javaMaster;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SubSequence {

	// Complete the hackerrankInString function below.
	static String hackerrankInString(String s) {

		if(s.contains("hackerrank")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		return s;

	}
	static void getString() {
		String haystack="Kodejava - Learn Java by Examples";
		  String key = "Java";
	        if (haystack.indexOf(key) != -1) {
	            System.out.println("Found the word " + key +
	                    " at index number " + haystack.indexOf(key));
	        } else {
	            System.out.println("Can't find " + key);
	        }

	        // Or use the String.contains() method if you are not interested
	        // with the index of the word.
	        if (haystack.contains(key)) {
	            System.out.println("Eureka we've found Java!");
	        }
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
			String result = hackerrankInString("hereiamstackerrank");
			System.out.println(result);
			//getString();
		}
}
