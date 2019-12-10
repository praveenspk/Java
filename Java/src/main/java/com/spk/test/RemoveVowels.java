package com.spk.test;

public class RemoveVowels {


	public static void main(String[] args) {

		String str = "Praveen";
		String resustr = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(resustr);

	}

}