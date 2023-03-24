package com.kyu.java.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

    public static void main(String[] args) {

        // SORT THE LIST NAMES IN ALPHABETICAL ORDER
        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");

        // Prior Java 8
        Collections.sort(stringList);
        System.out.println("Sorted list using Collections.sort() : " + stringList);

        // Java 8
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using List.sort() : " + stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using List.sort() reverse : " + stringList);

    }

}
