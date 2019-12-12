package com.spk.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Praveen
 *
 */
public class Exp2 {

	public static void main(String[] args) {
		
		String line=null;
		try(BufferedReader reader=new BufferedReader(new FileReader("D:\\spk.txt"))){
			
			while((line=reader.readLine())!=null) {
				System.out.println("File Reading Done : "+line);
			}
		}catch(IOException e) {
			e.getMessage();
		}
		
	}

}
