package com.spk.javaMaster;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * @author Praveen
 *
 */
public class GradingStudent {

	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {
		int ar[] = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 38)
				ar[i] = grades[i];
			else {
				int k = 0;
				for (int j = 0; j <= 4; j++) {
					if ((grades[i] + j) % 5 == 0) {
						k = j;
						break;
					}
				}
				if (k < 3)
					ar[i] = grades[i] + k;
				else
					ar[i] = grades[i];
			}
		}
		return (ar);
	}

	public static void main(String[] args) throws IOException {

		int[] grades = { 73, 67, 38, 33 };
		int[] result = gradingStudents(grades);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]); 
		}

	}
}
