package com.kyu.java.optional;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {

        Student student = StudentDataBase.studentSupplier.get();

        if (student != null) {
            return student.getName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional() {

        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

        /*  CODE BELOW SHOWS DEFENSIVE CODING FOR NULL POINTER EXCEPTION

        String name = getStudentName();
        if (name != null) {
            System.out.println("Length of the student Name : " + name.length());
        } else {
            System.out.println("Name not found");
        }
         */

        Optional<String> stringOptional = getStudentNameOptional();

        if (stringOptional.isPresent()) {
            System.out.println("Length of the student Name : " + stringOptional.get().length());
        } else {
            System.out.println("Name not found");
        }
    }

}
