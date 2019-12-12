package com.spk.jp;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Praveen
 *
 */
public class AlphbetList {

	static void printListNumber(List<Character> alphaList) {
		for (int i = 0; i <= alphaList.size(); i++) {
			for (int j = 25; j >= 0; j--) {
				System.out.println(alphaList.get(i) + " " + alphaList.get(j));
			}
		}
	}

	static void alpha() {
		for (Character ch = 'A', ch2 = 'Z'; ch != 'Z' + 1; ch++, ch2--) {
			System.out.println(ch + " " + ch2);
		}
	}

	public static void main(String[] args) {

		List<Character> list = new ArrayList<Character>();
		for (Character c = 65; c <= 65 + 25; c++) {
			list.add(c);
			//printListNumber(list);
			alpha();
		}
	}
}
