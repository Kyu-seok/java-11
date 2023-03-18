package com.kyu.java.streams;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList() {

        List<String> studentList =  StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        return studentList;
    }

    public static Set<String> namesSet() {

        Set<String> studentSet =  StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        return studentSet;
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());


    }

}
