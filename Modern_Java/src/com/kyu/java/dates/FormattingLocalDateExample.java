package com.kyu.java.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void parseLocalDate() {

        String date = "2023-04-03";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localDate : " + localDate);
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localDate1 : " + localDate1);

        String date1 = "20230403";
        LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate2 : " + localDate2);

        // Custom defined date format
        String date2 = "2018|04|28";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
        System.out.println("LocalDate3 : " + localDate3);

        String date3 = "2018*04*28";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate4 = LocalDate.parse(date3, dateTimeFormatter1);
        System.out.println("localDate4 : " + localDate4);

    }

    public static void formatLocalDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("formattedDate : " + formattedDate);
    }

    public static void main(String[] args) {

        parseLocalDate();
        formatLocalDate();

    }

}
