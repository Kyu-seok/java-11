package com.kyu.java.optional;

import com.kyu.java.data.Bike;
import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    // filter
    public static void optionalFilter() {

        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        studentOptional.filter(student -> student.getGpa() >= 3.5)
                .ifPresent(student -> System.out.println(student));
    }

    // map
    public static void optionalMap() {

        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()) {
            Optional<String> stringOptional = studentOptional
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(student -> student.getName());

            System.out.println(stringOptional.get());
        }
    }

    // flatmap
    public static void optionalFlatMap() {

        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<String> name = studentOptional
                .filter(student -> student.getGpa() >= 3.5)
                .flatMap(Student::getBike)
                .map(Bike::getModel);

        name.ifPresent(s -> System.out.println("name : " + s));
    }

    public static void main(String[] args) {

        optionalFilter();
        optionalMap();
        optionalFlatMap();

    }
}
