package com.spk.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author Praveen
 *
 */
public class Example {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		BufferedReader reader=null;
		String line=null;
		reader=new BufferedReader(new FileReader("d:\\praveen.txt"));
		while ((line=reader.readLine())!=null) {
		System.out.println("Done " +line);	
		}
		
	}

}
