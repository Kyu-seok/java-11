package com.kyu.java.functional_interfaces;

import com.kyu.java.data.Student;
import com.kyu.java.data.StudentDataBase;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void printName() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities");
        Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());
        List<Student> studentLists = StudentDataBase.getAllStudents();

        studentLists.forEach(c3.andThen(c4)); // consumer chaining
    }

    public static void printNameAndActivitiesUsingCondition() {

        System.out.println("printNameAndActivitiesUsingCondition");
        List<Student> studentLists = StudentDataBase.getAllStudents();

        studentLists.forEach((student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                c3.andThen(c4).accept(student);
            }
        }));
    }

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        c1.accept("java8");
        // printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();

    }

}
