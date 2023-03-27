package com.kyu.java.parallel_stream;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {

        Sum sum = new Sum();

        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(sum::performSum);

        System.out.println("Result : " + sum.getTotal());
    }

}
