package com.spk.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateTest {

    public static void main(String[] argv) {

        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");
        String dateInString = "Friday, Jun 7, 2013 12:10:56 PM";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}