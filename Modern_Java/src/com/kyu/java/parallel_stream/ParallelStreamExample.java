package com.kyu.java.parallel_stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int sumSequentialStream() {

        return IntStream.rangeClosed(1, 10000000)
                .sum();
    }

    public static int sumParallelStream() {

        return IntStream.rangeClosed(1, 10000000)
                .parallel()
                .sum();
    }

    public static void singleThreadStream() {
        Integer result = IntStream.rangeClosed(1, 50)
                .peek(num -> System.out.println(Thread.currentThread().getName() + " : " + num))
                .sum();

        System.out.println(result);
    }

    public static void multiThreadStream() {
        Integer result = IntStream.rangeClosed(1, 50)
                .parallel()
                .peek(num -> System.out.println(Thread.currentThread().getName() + " : " + num))
                .sum();

        System.out.println(result);
    }

    public static void main(String[] args) {

        System.out.println("Sequential Stream Result: "
                + checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
        System.out.println("Parallel Stream Result: "
                + checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));

        // singleThreadStream();
        multiThreadStream();
    }

}
