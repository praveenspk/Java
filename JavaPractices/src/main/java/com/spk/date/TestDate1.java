package com.spk.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate1 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc=null;
        String date_1=null;
        String date_2=null;
        sc=new Scanner(System.in);
        System.out.println("Enter Date to Convert::");
        date_1=sc.next();
        System.out.println("Enter Date to Convert:::");
        date_2=sc.next();
        Date date1 = sdf.parse(date_1);
        Date date2 = sdf.parse(date_2);

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 is equal to Date2");
        } else {
            System.out.println("How to get here?");
        }

    }

}