package com.kyu.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer.MIN_VALUE, (x, y) -> y > x ? y : x);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer::max);
    }

    public static int findMinValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> b < a ? b : a);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer::min);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);

        // Mav value
        int maxValue = findMaxValue(integerList);
        System.out.println("Max value is : " + maxValue);

        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
        if (maxValueOptional.isPresent()) {
            System.out.println("Max value using Optional : " + maxValueOptional.get());
        } else {
            System.out.println("Input list is empty.");
        }

        // Min value
        int minValue = findMinValue(integerList);
        System.out.println("Min value is : " + minValue);

        Optional<Integer> minValueOptional = findMinValueOptional(integerList);
        if (minValueOptional.isPresent()) {
            System.out.println("Min value using Optional : " + minValueOptional.get());
        } else {
            System.out.println("Input list is empty.");
        }
    }

}
