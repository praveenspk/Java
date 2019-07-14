package com.huawei.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class OpenCSVExample {

	static void getCVSFileLineByLine() throws IOException {
		// Build reader instance
		CSVReader reader = new CSVReader(new FileReader("Book2.csv"), ',', '"');

		// Read all rows at once
		List<String[]> allRows = reader.readAll();

		String s = "aa bb cc dd ee";
		s = s.replace("aa", "null");
		System.out.println("====================>" + s);
		// Read CSV line by line and use the string array as you want
		for (String[] row : allRows) {
			System.out.println(Arrays.toString(row));
		}
	}

	static void readCSVFile() {
		CSVReader reader1 = null;
		CSVReader reader2 = null;
		try {
			List<String[]> l1 = new ArrayList<String[]>();
			List<String[]> l2 = new ArrayList<String[]>();
			// Get the CSVReader instance with specifying the delimiter to be used
			reader1 = new CSVReader(new FileReader("Book1.csv"), ',');
			reader2 = new CSVReader(new FileReader("Book2.csv"), ',');
			String[] nextLine1;
			String[] nextLine2;
			String string;

			// Read one line at a time
			while ((nextLine1 = reader1.readNext()) != null) {
				// Each row we are pushing into list and in that list first [0] is code/id
				l1.add(nextLine1);
			}
			List codes1 = new ArrayList<String>();
			for (String[] strArray : l1) {
				// if(l1.indexOf(strArray)==0) {
				codes1.add(strArray[0]);
				// System.out.println(strArray[0]);
				// }
			}
			while ((nextLine2 = reader2.readNext()) != null) {
				// Each row we are pushing into list and in that list first [0] is code/id
				l2.add(nextLine2);
			}
			List codes2 = new ArrayList<String>();
			for (String[] str : l2) {
				codes2.add(str[0]);
				System.out.println(str[0]);
			}

			// System.out.println(l1);
			// System.out.println(l2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader1.close();
				reader2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws IOException {
		getCVSFileLineByLine();
	}
}