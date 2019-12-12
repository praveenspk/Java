//Scanner + try-with-resources example.
package com.spk.streams;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Praveen
 *
 */
public class TestReadFile5 {

	public static void main(String args[]) {

		String fileName = "d://JAVA//lines.txt";

		try (Scanner scanner = new Scanner(new File(fileName))) {

			while (scanner.hasNext()){
				System.out.println(scanner.nextLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
