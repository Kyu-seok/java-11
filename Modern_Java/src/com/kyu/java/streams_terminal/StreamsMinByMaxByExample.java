package com.kyu.java.streams_terminal;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    public static Optional<Student> minBy() {

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy() {

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {

        Optional<Student> studentMinOptional = minBy();

        if (studentMinOptional.isPresent()) {
            System.out.println(studentMinOptional.get());
        } else {
            System.out.println("No student found");
        }

        Optional<Student> studentMaxOptional = maxBy();

        if (studentMaxOptional.isPresent()) {
            System.out.println(studentMaxOptional.get());
        } else {
            System.out.println("No student found");
        }
    }

}
