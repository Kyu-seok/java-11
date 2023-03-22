package com.kyu.java.numeric_streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {

        System.out.println("Range Count : " + IntStream.range(1, 50).count());
        IntStream.range(1, 50).forEach((value -> System.out.print(value + ",")));

        System.out.println("\n");
        System.out.println("Range Closed Count : " + IntStream.rangeClosed(1, 50).count());
        IntStream.rangeClosed(1, 50).forEach((value -> System.out.print(value + ",")));

        System.out.println("\n");
        System.out.println("Long Stream Range Count : " + LongStream.range(1, 50).count());
        LongStream.range(1, 50).forEach((value -> System.out.print(value + ",")));

        System.out.println("\n");
        System.out.println("Long Stream Range Closed Count : " + LongStream.rangeClosed(1, 50).count());
        LongStream.rangeClosed(1, 50).forEach((value -> System.out.print(value + ",")));

        System.out.println("\n");
        System.out.println("Double Stream Range Closed Count : " + IntStream.rangeClosed(1, 50).asDoubleStream().count());
        IntStream.range(1, 50).asDoubleStream().forEach((value -> System.out.print(value + ",")));
    }

}
