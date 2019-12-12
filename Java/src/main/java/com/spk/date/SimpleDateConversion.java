package com.spk.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 * @author Praveen
 *
 */
public class SimpleDateConversion {

public static void main(String[] args) {
	
	Scanner sc=null;
	String date = null;
	sc=new Scanner(System.in);
	System.out.println("Enter Date(16/08/2016):::");
	date=sc.next();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	//convert String to LocalDate
	LocalDate localDate = LocalDate.parse(date, formatter);
	System.out.println(localDate);
}


}
