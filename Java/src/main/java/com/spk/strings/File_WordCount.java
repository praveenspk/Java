package com.spk.strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Praveen
 *
 */
public class File_WordCount {
	static void getWordCount() throws IOException {
		File f1 = new File("C:/Users/s84119411/Desktop/input.txt");
		String[] words = null;
		int wc = 0;
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			words = s.split(" ");
			wc = wc + words.length;
		}
		fr.close();
		System.out.println("Number of words in the file:" + wc);
	}

	static void getCharCount() throws IOException {
		File file = new File("C:/Users/s84119411/Desktop/input.txt");
		FileInputStream fis = new FileInputStream(file);
		System.out.println("File Reading succeded ");
		byte[] bytesArray = new byte[(int) file.length()];
		fis.read(bytesArray);
		String s = new String(bytesArray);
		// String[] data = s.split(" ");
		Map<Character, Integer> counterMap = new HashMap<Character, Integer>();
		for (char current : s.toCharArray()) {
			if (!counterMap.containsKey(current)) {
				counterMap.put(current, 1);
			} else {
				counterMap.put(current, counterMap.get(current) + 1);
			}
		}
		System.out.println("Input : " + s);
		System.out.println(counterMap);
		fis.close();
	}

	static void getWordCountByWord() throws IOException {

		File file = new File("C:/Users/s84119411/Desktop/input.txt");
		FileInputStream fis = new FileInputStream(file);
		System.out.println("File Reading succeded ");
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

	public static void main(String[] args) throws IOException {

		// getCharCount();
		// getWordCount();
		getWordCountByWord();

	}
}
