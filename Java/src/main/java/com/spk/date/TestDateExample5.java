package com.spk.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TestDateExample5 {

    public static void main(String[] argv) {
    	
    	Date d=null;
    	d=new java.util.Date();
    	System.out.println("System Date::"+d);
        SimpleDateFormat formatter = new SimpleDateFormat("d");
        String dateInString = "2014-10-05T15:23:01Z";

        try {

            Date date = formatter.parse(dateInString.replaceAll("Z$", "+0000"));
            System.out.println(date);

            System.out.println("time zone : " + TimeZone.getDefault().getID());
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}