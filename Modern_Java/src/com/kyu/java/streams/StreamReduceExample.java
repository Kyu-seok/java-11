package com.kyu.java.streams;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.nashorn.internal.runtime.options.Option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList) {

        return integerList.stream()
                .reduce(1, (a, b) -> a * b);

    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {

        return integerList.stream()
                .reduce((a, b) -> a * b);

    }

    public static Optional<Student> getHighestGpaStudent() {

        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        List<Integer> integers1 = new ArrayList<>();

        System.out.println(performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);

        System.out.println(result.isPresent());
        System.out.println(result.get());

        Optional<Integer> result1 = performMultiplicationWithoutIdentity(integers1);
        System.out.println(result1.isPresent());

        Optional<Student> studentOptional = getHighestGpaStudent();
        if (studentOptional.isPresent()) {
            System.out.println(studentOptional.get());
        }

    }
}
