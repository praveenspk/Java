/**
 * 
 */
package com.spk.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Praveen
 *
 */
public class Exit_Test {

	static void test(int[] arr) {
		try {
		    BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		    System.out.println(br.readLine());
		    
		    br.close();
		} catch (IOException e) {
		    System.exit(2);
		} finally {
		    System.out.println("Exiting the program");
		}
		
		
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("Before Exit(0)");
			System.exit(0);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("Exited from finally block");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		 test(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 5) {
				System.out.println("exit...");

				// Terminate JVM
				System.exit(0);
			} else
				System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println("End of Program");
	}
}
