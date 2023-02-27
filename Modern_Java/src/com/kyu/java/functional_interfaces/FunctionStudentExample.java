package com.kyu.java.functional_interfaces;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
        Map<String, Double> studentGrademap = new HashMap<>();
        students.forEach((student -> {
            if (PredicateStudentExample.p1.test(student)) {
                studentGrademap.put(student.getName(), student.getGpa());
            }
        }));

        return studentGrademap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }

}
