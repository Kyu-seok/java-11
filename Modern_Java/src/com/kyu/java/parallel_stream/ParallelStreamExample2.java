package com.kyu.java.parallel_stream;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample2 {

    public static List<String> sequentialPrintStudentActivities() {

        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential : " + (endTime - startTime));

        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities() {

        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .parallelStream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel : " + (endTime - startTime));

        return studentActivities;
    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }

}
