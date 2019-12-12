package com.spk.test;
/**
 * @author Praveen
 *
 */
public class Example {

	public static void main(String[] args) {

		
		int val = Integer.decode("12"); 
		Integer.decode("12").intValue();
		System.out.println(Integer.decode("12").intValue());
		String number = "spk";
		// Obtaining the integer values of the char 1 and 2 in ASCII
		int semilastdigitASCII = number.charAt(number.length() - 2);
		int lastdigitASCII = number.charAt(number.length() - 1);
		System.out.println(semilastdigitASCII + " " + lastdigitASCII);
		System.out.println(" ");
		Integer.parseInt("12"); // 12 - int
		Integer.valueOf("12"); // 12 - Integer
		Integer.decode("12"); // 12 - Integer
		// base 8
		// 10 (0,1,...,7,10,11,12)
		Integer.parseInt("12", 8); // 10 - int
		Integer.valueOf("12", 8); // 10 - Integer
		Integer.decode("012"); // 10 - Integer
		// base 16
		// 18 (0,1,...,F,10,11,12)
		Integer.parseInt("12", 16); // 18 - int
		Integer.valueOf("12", 16); // 18 - Integer
		Integer.decode("#12"); // 18 - Integer
		Integer.decode("0x12"); // 18 - Integer
		Integer.decode("0X12"); // 18 - Integer
		// base 2
		Integer.parseInt("11", 2); // 3 - int
		Integer.valueOf("11", 2); // 3 - Integer
	}

}
