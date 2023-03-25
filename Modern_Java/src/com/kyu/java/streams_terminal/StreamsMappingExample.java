package com.kyu.java.streams_terminal;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamsMappingExample {

    public static void main(String[] args) {

        List<String> nameList = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));

        Set<String> nameSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));

        System.out.println("nameList : " + nameList);
        System.out.println("nameSet : " + nameSet);

    }

}
