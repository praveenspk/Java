package com.spk.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class POI_Utility {
	public static int generateReport(Calendar csdate, Calendar cedate) throws Exception {
		FileInputStream fileIn = null;
		FileOutputStream fileOut = null;
		int sum = 0;// For calculating the total number of tickets
		final Workbook wb;
		fileIn = new FileInputStream("C:\\Users\\s84119411\\Desktop\\Book1.xlsx");
		//wb = org.apache.poi.ss.usermodel.WorkbookFactory.create(fileIn);// <-- Exception
		//final Sheet sheet = wb.getSheet("Report");
		// rest of stuff
		return sum;
	}

	public static void main(String[] args) {

	}

}
