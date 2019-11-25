/*
 * 
 * 
 *  Develop a program where user give 
 *  input as string like - AAA BCC AACB BDAA
 * and output should print like - 3a B2c 2aCB BD2a
 * 
 * */

package com.spk.regex;

import java.util.HashMap;
import java.util.Map;

class StringPattern {
	public String makePattern(String input) {
		String wordMapper = "";
		for (String word : input.split(" ")) {
			wordMapper += countOccurance(word);
		}
		return wordMapper;
	}

	public String countOccurance(String word) {
		StringBuilder builder = new StringBuilder();
		Map<String, Integer> wordMap = new HashMap<>();
		for (String s1 : word.trim().split("")) {
			if (wordMap.containsKey(s1)) {
				wordMap.put(s1, wordMap.get(s1) + 1);
			} else {
				wordMap.put(s1, 1);
			}
		}

		for (String key : wordMap.keySet()) {
			builder.append(key).append(wordMap.get(key));
		}
		return builder.toString().substring(1, builder.toString().length()).concat(" ");
	}

	public static void main(String[] args) {
		StringPattern pattern = new StringPattern();
		System.out.println(pattern.makePattern("AAABB BCCDDD CBEE"));
		System.out.println(pattern.makePattern("AAA BCC AACB BDAA"));
	
	}
}