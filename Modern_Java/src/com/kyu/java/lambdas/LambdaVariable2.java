package com.kyu.java.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value = 4;

    public static void main(String[] args) {


        Consumer<Integer> c1 = (i) -> {
            value++;
            System.out.println(value + i);
        };

        c1.accept(4);

    }

}
