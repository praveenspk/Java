package com.spk.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;
/**
 * @author Praveen
 *
 */
public class File_List {
	static void getFileList() {

		File file = new File("D:/");
		System.out.println(
				filesize_in_megaBytes(file) + " " + filesize_in_kiloBytes(file) + " " + filesize_in_Bytes(file));
		if (file.exists()) {
			String[] fileList = file.list();
			for (String name : fileList) {
				System.out.println(name);
			}
		}
	}

	private static String filesize_in_megaBytes(File file) {
		return (double) file.length() / (1024 * 1024) + " MB";
	}

	private static String filesize_in_kiloBytes(File file) {
		return (double) file.length() / 1024 + " KB";
	}

	private static String filesize_in_Bytes(File file) {
		return (double) file.length() + " Bytes";
	}

	static void getLastModifiedFile() {

		File file = new File("C:/Users/s84119411/Desktop/ToDo.docx");
		if (file.canWrite() && file.canRead()) {
			System.out.println(file + " allowd to read and write ");
			if (file.exists()) {
				Date date = new Date(file.lastModified());
				System.out.println(file + " is Last Modified On " + date);
			} else {
				System.out.println(" Oops File not Found....!!");
			}

		}
	}

	static void fileOperations() {

		File file = new File("C:/Users/s84119411/Desktop/ToDo.docx");
		if (file.isDirectory()) {
			System.out.println(file.getAbsolutePath() + " is Directory");
		} else if (file.isFile()) {
			System.out.println(file.getAbsoluteFile() + " is File ");
			System.out.println(
					filesize_in_megaBytes(file) + " " + filesize_in_kiloBytes(file) + " " + filesize_in_Bytes(file));
		}

		if (file.canWrite()) {
			System.out.println(file.getAbsoluteFile().getAbsolutePath() + " can Write Permission");
		} else {
			System.out.println(file.getAbsoluteFile().getAbsolutePath() + " Don't have Write Permission");
		}

		if (file.canRead()) {
			System.out.println(file.getAbsolutePath() + " Can read Permission");

		} else {
			System.out.println(file.getAbsolutePath() + " Don't have read Permission");

		}
	}

	public static void getFileWithExtension() {
		File file = new File("C:/Users/s84119411/Spring/Java_Collections/");
		String[] list = file.list(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".java")) {
					return true;
				} else {
					return false;
				}
			}
		});
		for (String f : list) {
			System.out.println(f);
		}
	}

	public static void main(String[] args) {
		getFileList();
		// getFileWithExtension();
		getLastModifiedFile();
		fileOperations();
	}

}
