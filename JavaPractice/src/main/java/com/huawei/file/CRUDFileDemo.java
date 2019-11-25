package com.huawei.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.zip.GZIPOutputStream;

public class CRUDFileDemo {
	static void modifiedFileDate() throws IOException {
		File file = new File("C:/Users/s84119411/Spring/Java_Collections/sample.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
		System.out.println(file.lastModified());
	}

	static void createFile() {
		try {
			File file = new File("C:/Users/s84119411/Spring/Java_Collections/sample.txt");
			/*
			 * If file gets created then the createNewFile() method would return true or if
			 * the file is already present it would return false
			 */

			boolean fvar = file.createNewFile();
			if (fvar) {
				System.out.println("File has been created successfully");
			} else {
				System.out.println("File already present at the specified location");
			}
		} catch (IOException e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
	}

	static void readFile() {
		File file = new File("C:/Users/s84119411/Spring/Java_Collections/sample.txt");
		BufferedInputStream bis = null;
		FileInputStream fis = null;

		try {
			// FileInputStream to read the file
			fis = new FileInputStream(file);

			/*
			 * Passed the FileInputStream to BufferedInputStream For Fast read using the
			 * buffer array.
			 */
			bis = new BufferedInputStream(fis);

			/*
			 * available() method of BufferedInputStream returns 0 when there are no more
			 * bytes present in the file to be read
			 */
			while (bis.available() > 0) {
				System.out.print((char) bis.read());
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("The specified file not found" + fnfe);
		} catch (IOException ioe) {
			System.out.println("I/O Exception: " + ioe);
		} finally {
			try {
				if (bis != null && fis != null) {
					fis.close();
					bis.close();
				}
			} catch (IOException ioe) {
				System.out.println("Error in InputStream close(): " + ioe);
			}
		}
	}

	static void writeFile() {
		FileOutputStream fos = null;
		File file;
		String mycontent = "This is my Data which needs" + " to be written into the file";
		try {
			// Specify the file path here
			file = new File("C:/Users/s84119411/Spring/Java_Collections/sample.txt");
			fos = new FileOutputStream(file);

			/*
			 * This logic will check whether the file exists or not. If the file is not
			 * found at the specified location it would create a new file
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			/*
			 * String content cannot be directly written into a file. It needs to be
			 * converted into bytes
			 */
			byte[] bytesArray = mycontent.getBytes();

			fos.write(bytesArray);
			fos.flush();
			System.out.println("File Written Successfully");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException ioe) {
				System.out.println("Error in closing the Stream");
			}
		}
	}

	static void appendFile() {
		try {
			String content = "This is my content which would be appended " + "at the end of the specified file";
			// Specify the file name and path here
			File file = new File("C:/Users/s84119411/Spring/Java_Collections/sample.txt");

			/*
			 * This logic is to create the file if the file is not already present
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			// Here true is to append the content to file
			FileWriter fw = new FileWriter(file, true);
			// BufferedWriter writer give better performance
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			// Closing BufferedWriter Stream
			bw.close();

			System.out.println("Data successfully appended at the end of file");

		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

	static void deleteFile() {
		try {
			// Specify the file name and path
			File file = new File("C:/Users/s84119411/Spring/Java_Collections/sample.txt");
			/*
			 * the delete() method returns true if the file is deleted successfully else it
			 * returns false
			 */
			if (file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			} else {
				System.out.println("Delete failed: File didn't delete");
			}
		} catch (Exception e) {
			System.out.println("Exception occurred");
			e.printStackTrace();
		}
	}

	static void zipFile() {
		CRUDFileDemo zipObj = new CRUDFileDemo();
		zipObj.gzipMyFile();
	}

	public void gzipMyFile() {
		byte[] buffer = new byte[1024];
		try {
			// Specify Name and Path of Output GZip file here
			GZIPOutputStream gos = new GZIPOutputStream(
					new FileOutputStream("C:/Users/s84119411/Spring/Java_Collections/sample.txt"));

			// Specify location of Input file here
			FileInputStream fis = new FileInputStream("C:/Users/s84119411/Spring/Java_Collections/sample.txt");

			// Reading from input file and writing to output GZip file
			int length;
			while ((length = fis.read(buffer)) > 0) {

				/*
				 * public void write(byte[] buf, int off, int len): Writes array of bytes to the
				 * compressed output stream. This method will block until all the bytes are
				 * written. Parameters: buf - the data to be written off - the start offset of
				 * the data len - the length of the data
				 */
				gos.write(buffer, 0, length);
			}

			fis.close();

			/*
			 * public void finish(): Finishes writing compressed data to the output stream
			 * without closing the underlying stream.
			 */
			gos.finish();
			gos.close();

			System.out.println("File Compressed!!");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	static void copyFile() {
		FileInputStream instream = null;
		FileOutputStream outstream = null;

		try {
			File infile = new File("C:/Users/s84119411/Spring/Java_Collections/input.txt");
			File outfile = new File("C:/Users/s84119411/Spring/Java_Collections/sample.txt");

			instream = new FileInputStream(infile);
			outstream = new FileOutputStream(outfile);

			byte[] buffer = new byte[1024];

			int length;
			/*
			 * copying the contents from input stream to output stream using read and write
			 * methods
			 */
			while ((length = instream.read(buffer)) > 0) {
				outstream.write(buffer, 0, length);
			}

			// Closing the input/output file streams
			instream.close();
			outstream.close();

			System.out.println("File copied successfully!!");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	static void readOnlyFile() {
		File myfile = new File("C:/Users/s84119411/Spring/Java_Collections/sample.txt");

		if (myfile.isHidden()) {
			System.out.println("The specified file is hidden");
		} else {
			System.out.println("The specified file is not hidden");
		}

		// making the file read only
		boolean flag = myfile.setReadOnly();

		if (flag == true) {
			System.out.println("File successfully converted to Read only mode!!");
		} else {
			System.out.println("Unsuccessful Operation!!");
		}

		// making the file Writable only
		if (myfile.setWritable(true)) {
			System.out.println("File Successfully Converted to Writable Mode ");
		} else {
			System.out.println("Unsuccesfull  ");
		}

	}

	static void readWriteByBufferedReader() {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader("C:/Users/s84119411/Desktop/input.txt"));
			String fileContent = reader.readLine();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {

		modifiedFileDate();
		// createFile();
		// readFile();
		// writeFile();
		// appendFile();
		// deleteFile();
		// zipFile();
		copyFile();
		// readFile();
		// readOnlyFile();

	}
}