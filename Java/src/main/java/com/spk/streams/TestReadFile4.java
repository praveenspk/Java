/*
Classic BufferedReader And Scanner
Enough of Java 8 and Stream, let revisit the classic BufferedReader (JDK1.1) and Scanner (JDK1.5) examples to read a file line by line, it is working still, just developers are moving toward Stream.

BufferedReader + try-with-resources example.*/


package com.spk.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author Praveen
 *
 */
public class TestReadFile4{

	public static void main(String args[]) {

		String fileName = "d://JAVA//lines.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}