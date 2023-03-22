package com.kyu.java.numeric_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing() {

        return IntStream.range(1, 10)           // IntStream
                .boxed()                        // Stream<Integer>
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList) {
        return integerList.stream()             // Stream<Integer>
                .mapToInt(Integer::intValue)    // IntStream
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("Boxing : " + boxing());
        System.out.println("Unboxing : " + unBoxing(Arrays.asList(1, 2, 3, 4, 5)));
    }

}
