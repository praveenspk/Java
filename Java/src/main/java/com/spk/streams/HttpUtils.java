package com.spk.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class HttpUtils {

    public static void main(String[] args) {

        String fromFile = "ftp://ftp.arin.net/pub/stats/arin/delegated-arin-extended-latest";
        String toFile = "d:\\JAVA\\arin.txt";

        try {

            URL website = new URL(fromFile);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(toFile);
            fos.getChannel().transferFrom(rbc, Long.MIN_VALUE, Long.MAX_VALUE);
            System.out.println();
            if(fos!=null)
            	System.out.println("Copied SuccesFully.........!!!!!");
            else
            	System.out.println("Copied Failed.......!!");
            
            fos.close();
            rbc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}