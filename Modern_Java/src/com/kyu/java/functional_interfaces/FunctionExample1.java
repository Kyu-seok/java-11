package com.kyu.java.functional_interfaces;

public class FunctionExample1 {

    public static String performConcat(String str) {

        return FunctionExample.addSomeString.apply(str);

    }

    public static void main(String[] args) {

        String result = performConcat("Hello");

        System.out.println("Result : " + result);
    }

}
