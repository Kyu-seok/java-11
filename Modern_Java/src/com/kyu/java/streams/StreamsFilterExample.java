package com.kyu.java.streams;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {

        return StudentDataBase.getAllStudents().stream()                                // Stream<Student>
                .filter((student -> student.getGender().equals("female")))              // Stream<Student>
                .filter(student -> student.getGpa() >= 3.9)                             // Stream<Student>
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // System.out.println("filterStudents : " + filterStudents());

        filterStudents().forEach(System.out::println);
    }

}
