package com.spk.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author Praveen
 *
 */
public class FileCopy {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		File f = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;

		try {
			f = new File("input.txt");
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("Output.txt");
			bos = new BufferedOutputStream(fos);
			while ((c = bis.read()) != -1) {
				bos.write(c);
				bos.flush();

			}
			System.out.println("File Copying completed.....!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}

			} catch (IOException e) {
				e.getMessage();
			}
		}
	}

}
