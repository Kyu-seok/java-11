package com.kyu.java.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable("Hello Optional");

        // isPresent
        System.out.println(optional.isPresent());
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        // ifPresent
        optional.ifPresent(s -> System.out.println(s));

    }

}
