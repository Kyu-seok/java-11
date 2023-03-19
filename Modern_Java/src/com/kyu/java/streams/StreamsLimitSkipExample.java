package com.kyu.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream()
                .limit(3)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream()
                .skip(3)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);

        // Limit
        Optional<Integer> limitResult = limit(integers);
        if (limitResult.isPresent()) {
            System.out.println("The limit result is : " + limitResult.get());
        } else {
            System.out.println("No input is passed");
        }

        // Skip
        Optional<Integer> skipResult = skip(integers);
        if (skipResult.isPresent()) {
            System.out.println("The skip result is : " + skipResult.get());
        } else {
            System.out.println("No input is passed");
        }
    }

}
