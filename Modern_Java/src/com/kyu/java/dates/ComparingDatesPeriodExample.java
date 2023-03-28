package com.kyu.java.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ComparingDatesPeriodExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2018, 1, 1);
        LocalDate localDate1 = LocalDate.of(2018, 12, 31);

        Period period = localDate.until(localDate1);
        System.out.println("getDays : " + period.getDays());    // result is 30, which performs 31 - 1
        System.out.println("getMonths : " + period.getMonths());
        System.out.println("getYears : " + period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println("period1.getDays : " + period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println("period2.getYears : " + period2.getYears());
        System.out.println("toTotalMonths : " + period2.toTotalMonths());

        Period period3 = Period.between(localDate, localDate1);
        System.out.println("Period : " + period3.getYears() + "-" + period3.getMonths() + "-" + period3.getDays());

    }

}
