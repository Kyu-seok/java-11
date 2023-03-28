package com.kyu.java.dates;

import java.time.*;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : " + zonedDateTime);

        System.out.println("zoneOffset : " + zonedDateTime.getOffset());
        System.out.println("zone ID : " + zonedDateTime.getZone());

        // System.out.println("Available Zones : " + ZoneId.getAvailableZoneIds());

        ZoneId.getAvailableZoneIds()
                .forEach(System.out::println);

        System.out.println("No of Zones : " + ZoneId.getAvailableZoneIds().size());

        // Different time zones in America : CST, EST, MST, PST
        System.out.println("Chicago CST : " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("Detroit CST : " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println("LA PST      : " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println("Denver MST  : " + ZonedDateTime.now(ZoneId.of("America/Denver")));
        System.out.println("ZonedDateTime using clock : " + ZonedDateTime.now(Clock.system(ZoneId.of("Asia/Seoul"))));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("Seoul : " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("Asia/Seoul")));
        System.out.println("Seoul : " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("ofInstant : " + localDateTime2);

        // convert from LocalDateTime, Instant to ZonedLocalDate and ZonedTime
        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println("localDateTime3 : " + localDateTime3);
        ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime1 : " + zonedDateTime1);

        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime2 : " + zonedDateTime2);

        OffsetDateTime offsetDateTime = localDateTime3.atOffset(ZoneOffset.ofHours(+9));
        System.out.println("offsetDateTime : " + offsetDateTime);

    }

}
