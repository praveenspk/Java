package com.spk.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 * @author Praveen
 *
 */
public class SimpleDateConversion1 {

public static void main(String[] args) {
	
	//Scanner sc=null;
	//String date = null;
	//sc=new Scanner(System.in);
	//System.out.println("Enter Date(15/08/2017):::");
	//date=sc.next();
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");

	 String date = "15-Aug-2017";

     LocalDate localDate = LocalDate.parse(date, formatter);

     System.out.println(localDate.getDayOfMonth()+"  "+localDate.getDayOfWeek()+"    "  +localDate.getMonthValue()+"   "+localDate.getYear());  //default, print ISO_LOCAL_DATE

     System.out.println(formatter.format(localDate));
}


}
