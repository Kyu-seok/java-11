package com.kyu.java.method_reference;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    // static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s) {
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {

        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

    }

}
