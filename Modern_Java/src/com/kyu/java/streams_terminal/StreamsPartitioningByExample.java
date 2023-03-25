package com.kyu.java.streams_terminal;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartitioningByExample {

    public static void partitioningBy1() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() > 3.8;

        Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));

        System.out.println(partitioningMap);
    }

    public static void partitioningBy2() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() > 3.8;

        Map<Boolean, Set<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));

        System.out.println(partitioningMap);
    }

    public static void main(String[] args) {
        // partitioningBy1();
        partitioningBy2();
    }

}
