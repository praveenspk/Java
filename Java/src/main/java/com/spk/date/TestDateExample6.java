package com.spk.date;

import java.time.*;
/**
 * @author Praveen
 *
 */
public class TestDateExample6 {

    public static void main(String[] argv) {

        String dateInString = "2017-04-05T15:23:01Z";

        Instant instant = Instant.parse(dateInString);

        System.out.println(instant);

        //get date time only
        LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));

        System.out.println(result);

        //get date time + timezone
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Tripoli"));
        System.out.println(zonedDateTime);

        //get date time + timezone
        ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Europe/Athens"));
        System.out.println(zonedDateTime2);

    }

}