package com.kyu.java.defaults;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);

    public static void sortByName(List<Student> studentList) {
        System.out.println("After Sort : ");
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> studentList) {
        System.out.println("After Sort : ");
        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList) {
        System.out.println("After comparatorChaining : ");
        studentList.sort(gradeComparator.thenComparing(gpaComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList) {

        System.out.println("After sort with null values : ");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);

    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before Sort : ");
        studentList.forEach(studentConsumer);

        // sortByName(studentList);
        // sortByGpa(studentList);
        // comparatorChaining(studentList);
        sortWithNullValues(studentList);

    }

}
