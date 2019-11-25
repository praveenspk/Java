package com.huawei.date;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DateTimeOperations {

	static void getCorrentTimeDate() {
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current Date and Time :  " + current);
	}

	static void convertStringToDate() {

		// Format y-M-d or yyyy-MM-d
		String string = "2017-07-25";
		// Format yyyy-MM-dd HH:MM:SS:MSS
		String str = "2019-07-02T10:22:12.013";
		LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
		System.out.println(date);

		LocalDateTime timeFormatter = LocalDateTime.parse(str, DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(timeFormatter);

	}

	static void getFileDir() throws IOException {
		/*
		 * // Method1 String path1 = System.getProperty("user.dir");
		 * System.out.println(path1); // Method2 String paths =
		 * Paths.get("").toAbsolutePath().toString(); System.out.println(paths);
		 */

		String path = System.getProperty("user.dir") + "\\input.txt";
		Charset encoding = Charset.defaultCharset();
		List<String> lines = Files.readAllLines(Paths.get(path), encoding);
		System.out.println(lines);
	}

	static void fileToByte() {

		String path = System.getProperty("user.dir") + "\\input.txt";
		String text = "Added text";

		try {
			// byte[] byteArray = Files.readAllBytes(Paths.get(path));
			// System.out.println("File to byte copied : " + byteArray.toString());
			Charset encoding = Charset.defaultCharset();
			Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
			List<String> lines = Files.readAllLines(Paths.get(path), encoding);
			System.out.println(lines);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		// getCorrentTimeDate();
		// convertStringToDate();
		// getFileDir();
		fileToByte();
	}
}
