package com.huawei.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDF_TXT {

	public static void main(String[] args) {

		File inputFile = new File("D:\\OWS\\Probe Guide.pdf");
		if (inputFile.exists()) {
			System.out.println("Input File:" + inputFile.getAbsolutePath());
			PDF_TXT please = new PDF_TXT();

			File txtFile = please.convertPDFtoText(inputFile);
			assert (txtFile.exists());
			System.out.println("Text... File:" + txtFile.getAbsolutePath());

		} else {
			System.out.println("File does not exist:" + inputFile.getAbsolutePath());
		}
	}

	public File convertPDFtoText(File inputFile) {
		try {
			String newFileName = replaceSuffix(inputFile.getName(), ".txt");
			String newPath = inputFile.getAbsoluteFile().getParent() + File.separator + newFileName;
			File outFile = new File(newPath);
			PDDocument document = PDDocument.load(inputFile);
			PDFTextStripper stripper = new PDFTextStripper();
			stripper.writeText(document, new FileWriter(outFile));
			return outFile;
		} catch (IOException e) {
			throw new FailedException(e);
		}
	}

	private class FailedException extends RuntimeException {
		private static final long serialVersionUID = 2L;

		public FailedException(Exception e) {
			super(e);
		}
	}

	public static String replaceSuffix(String fileName, String suffix) {
		int index = fileName.indexOf('.', 0);
		if (index != -1) {
			int lastIndex = index;
			while (index != -1) {
				index = fileName.indexOf('.', lastIndex + 1);
				if (index != -1)
					lastIndex = index;
			}
			return fileName.substring(0, lastIndex) + suffix;
		} else {
			return fileName + "suffix";
		}
	}
}