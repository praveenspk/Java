package com.huawei.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;

public class File_Append {
	public static final String file = "C:/Users/s84119411/Desktop/ToDo.docx";
	static void setTextToFile() {
		//String file = "C:/Users/s84119411/Desktop/ToDo.docx";
		InputStream input = null;
		try {
			input = new FileInputStream(file);
			int readCount = 0;
			byte[] content = new byte[2 * 1024];
			while ((readCount = input.read(content)) > 0) {
				System.out.println(new String(content, 0, readCount - 1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void readLineByLine() {
		BufferedReader br = null;
		String strLine = null;
		try {
			br=new BufferedReader(new FileReader(file));
			while((strLine=br.readLine())!=null) {
				System.out.println(strLine); 
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		//setTextToFile();
		readLineByLine();
	}

}
