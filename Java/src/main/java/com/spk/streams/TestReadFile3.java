/* BufferedReader + Stream
A new method lines() has been added since 1.8, it lets BufferedReader returns content as Stream.*/

package com.spk.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * @author Praveen
 *
 */
public class TestReadFile3{

	public static void main(String args[]) {

		String fileName = "d://JAVA//lines.txt";
		List<String> list = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

			//br returns as stream and convert it into a List
			list = br.lines().collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}

		list.forEach(System.out::println);

	}

}