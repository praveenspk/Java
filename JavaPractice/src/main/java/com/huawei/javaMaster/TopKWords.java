package com.huawei.javaMaster;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TopKWords {
	static class CountWords {
		private String fileName;

		public CountWords(String fileName) {
			this.fileName = fileName;
		}

		public Map<String, Integer> getDictionary() {
			Map<String, Integer> dictionary = new HashMap<>();
			FileInputStream fis = null;

			try {

				fis = new FileInputStream(fileName); // open the file
				int in = 0;
				String s = ""; // init a empty word
				in = fis.read(); // read one character

				while (-1 != in) {
					if (Character.isLetter((char) in)) {
						s += (char) in; // if get a letter, append to s
					} else {
						// this branch means an entire word has just been read
						if (s.length() > 0) {
							// see whether word exists or not
							if (dictionary.containsKey(s)) {
								// if exist, count++
								dictionary.put(s, dictionary.get(s) + 1);
							} else {
								// if not exist, initiate count of this word with 1
								dictionary.put(s, 1);
							}
						}
						s = ""; // reInit a empty word
					}
					in = fis.read();
				}
				return dictionary;
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					// you always have to close the I/O streams
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return null;
		}
	}

	public static void main(String[] args) {
		// you can replace the filePath with yours
		CountWords cw = new CountWords("/Users/s84119411/Desktop/ToDo.docx");//C:\Users\s84119411\Desktop
		Map<String, Integer> dictionary = cw.getDictionary(); // get the words dictionary: {word: frequency}

		// we change the map to list for convenient sort
		List<Map.Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());

		// sort by lambda valueComparator
		list.sort(Comparator.comparing(m -> m.getValue()));

		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		while (k > list.size()) {
			System.out.println("Retype a number, your number is too large");
			input = new Scanner(System.in);
			k = input.nextInt();
		}
		for (int i = 0; i < k; i++) {
			System.out.println(list.get(list.size() - i - 1));
		}
	}
}