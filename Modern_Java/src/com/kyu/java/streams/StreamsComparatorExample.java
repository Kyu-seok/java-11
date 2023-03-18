package com.kyu.java.streams;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName() {

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpa() {

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpaDesc() {

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGradeThenGpa() {

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGradeLevel).reversed().thenComparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("Students sorted by Name :");
        sortStudentsByName().forEach(System.out::println);

        System.out.println("Students sorted by GPA :");
        sortStudentsByGpa().forEach(System.out::println);

        System.out.println("Students sorted by GPA DESC :");
        sortStudentsByGpaDesc().forEach(System.out::println);

        System.out.println("Students sorted by Grade then GPA :");
        sortStudentsByGradeThenGpa().forEach(System.out::println);
    }

}
