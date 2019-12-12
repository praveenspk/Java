//Java 8 Read File + Stream

package com.spk.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
/**
 * @author Praveen
 *
 */
public class TestReadFile {

	public static void main(String args[]) {

		String fileName = "D://JAVA//lines.txt";

		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}