package com.kyu.java.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<Student> studentSupplier = () -> {
        return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));
    };

    public static List<Student> getAllStudents() {

        Student student1 = new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"), 11);
        Student student2 = new Student("Jenny", 2, 3.8, "female", Arrays.asList("swimming", "gymnastics", "soccer"), 12);
        Student student3 = new Student("Emily", 3, 4.0, "female", Arrays.asList("swimming", "gymnastics", "aerobics"), 10);
        Student student4 = new Student("Dave", 3, 3.9, "male", Arrays.asList("swimming", "gymnastics", "soccer"), 9);
        Student student5 = new Student("Sophia", 4, 3.5, "female", Arrays.asList("swimming", "dancing", "football"), 15);
        Student student6 = new Student("James", 4, 3.9, "male", Arrays.asList("swimming", "basketball", "baseball", "football"), 14);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);
        return students;
    }
}
