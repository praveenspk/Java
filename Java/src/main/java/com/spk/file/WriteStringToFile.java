package com.spk.file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 * @author Praveen
 *
 */
public class WriteStringToFile {

	public static void main(String[] args) {
		String str = "Write String to file";
		try (PrintWriter out = new PrintWriter("praveen.txt")) {
			out.println(str);
			System.out.println("Copied successfully..!!!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
	}
}