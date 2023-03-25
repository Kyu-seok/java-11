package com.kyu.java.streams_terminal;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static void groupStudentsByGender() {

        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    public static void customizedGroupingBy() {

        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping1() {

        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"))
                );

        System.out.println(studentMap);
    }

    public static void twoLevelGrouping2() {

        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.summingInt(Student::getNoteBooks))
                );

        System.out.println(studentMap);
    }

    public static void threeArgumentGroupBy() {
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));

        System.out.println(studentLinkedHashMap);
    }

    public static void calculateTopGpa() {
        Map<Integer, Student> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));

        System.out.println(studentMapOptional);
    }

    public static void calculateLeastGpa() {
        Map<Integer, Student> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));

        System.out.println(studentMapOptional);
    }

    public static void main(String[] args) {
        groupStudentsByGender();
        customizedGroupingBy();
        twoLevelGrouping1();
        twoLevelGrouping2();
        threeArgumentGroupBy();
        calculateTopGpa();
        calculateLeastGpa();
    }

}
