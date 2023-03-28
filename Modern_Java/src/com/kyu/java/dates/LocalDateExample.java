package com.kyu.java.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : " + localDate);

        LocalDate localDate1 = LocalDate.of(2023, 04, 04);
        System.out.println("localDate1 : " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2023, 1);
        System.out.println("localDate2 : " + localDate2);

        // Get values form localDate
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getChronology());
        System.out.println(localDate.getEra());
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));

        // Modifying Local Date
        System.out.println("plusDays : " + localDate.plusDays(2));
        System.out.println("plusDays : " + localDate.plusMonths(2));
        System.out.println("minusDays : " + localDate.minusDays(2));
        System.out.println("withYear : " + localDate.withYear(2024));
        System.out.println("with ChronoField : " + localDate.with(ChronoField.YEAR, 2025));
        System.out.println("with TemporalAdjusters : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("ChronoUnit Minus : " + localDate.minus(1, ChronoUnit.YEARS));

        // Additional Support methods
        System.out.println("leapYear : " + LocalDate.ofYearDay(2020, 01).isLeapYear());

        // localDate = 03-April-2023
        // localDate = 03-April-2023
        System.out.println("isEqual : " + localDate.isEqual(localDate1));
        System.out.println("isBefore : " + localDate.isBefore(localDate1));
        System.out.println("isAfter : " + localDate1.isAfter(localDate));

    }

}
