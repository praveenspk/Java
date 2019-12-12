package com.spk.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author Praveen
 *
 */
public class WordCount_FileDemo {

	static void getWordCountByWord() throws IOException {
		File file = new File("C:/Users/s84119411/Desktop/input.txt");
		FileInputStream fis = new FileInputStream(file);
		// System.out.println("File Reading succeded ");
		byte[] bytesArray = new byte[(int) file.length()];
		fis.read(bytesArray);
		String input = new String(bytesArray);
		String[] words = input.split(" "); // Split the word from String
		int wrc = 1; // Variable for getting Repeated word count

		for (int i = 0; i < words.length; i++) // Outer loop for Comparison
		{
			for (int j = i + 1; j < words.length; j++) // Inner loop for Comparison
			{

				if (words[i].equals(words[j])) // Checking for both strings are equal
				{
					wrc = wrc + 1; // if equal increment the count
					words[j] = "0"; // Replace repeated words by zero
				}
			}
			if (words[i] != "0")
				System.out.println(words[i] + "--" + wrc); // Printing the word along with count
			wrc = 1;
		}

		fis.close();
	}

	static void getWordCountByWordByBufferedReader() throws IOException {

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("C:/Users/s84119411/Desktop/input.txt"));
			// System.out.println("Reading the file using readLine() method:");

			String contentLine = reader.readLine();
			System.out.println(contentLine);
			while (contentLine != null) {
				String input = new String(contentLine);
				String[] words = input.split(" "); // Split the word from String
				int wrc = 1; // Variable for getting Repeated word count

				for (int i = 0; i < words.length; i++) // Outer loop for Comparison
				{
					for (int j = i + 1; j < words.length; j++) // Inner loop for Comparison
					{

						if (words[i].equals(words[j])) // Checking for both strings are equal
						{
							wrc = wrc + 1; // if equal increment the count
							words[j] = "0"; // Replace repeated words by zero
						}
					}
					if (words[i] != "0")
						System.out.println(words[i] + "--" + wrc); // Printing the word along with count
					wrc = 1;
				}
				contentLine = reader.readLine();
			}
			while (contentLine != null) {
				System.out.println(contentLine);
				contentLine = reader.readLine();
			}

		} catch (

		IOException ioe) {
			ioe.printStackTrace();
		} finally {

		}

	}

	public static void main(String[] args) throws IOException {

		getWordCountByWord();
		// getWordCountByWordByBufferedReader();
	}
}
