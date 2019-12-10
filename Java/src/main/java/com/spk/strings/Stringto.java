package com.spk.strings;


import java.util.Arrays;
import java.util.regex.Pattern;

public class Stringto {
	public static void main(String[] args) {
		String blogName = "java Praveen";
		String[] words = null;
		 
		// Method 1 :: using String.split() method
		words = blogName.split(" ");         
		
		System.out.println(Arrays.toString(words));
		// Method 2 :: using Pattern.split() method
		Pattern pattern = Pattern.compile(" ");
		words = pattern.split(blogName);    
		System.out.println(Arrays.toString(words));
		 
		//2. String[] to String
		 
		String newName = String.join(" ", words);  
		System.out.println( newName);
	}

}
