package com.kyu.java.streams_terminal;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining2() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joining3() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println("joining1 : " + joining1());
        System.out.println("joining2 : " + joining2());
        System.out.println("joining3 : " + joining3());
    }

}
