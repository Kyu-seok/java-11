package com.kyu.java.defaults;

public interface Interface3 extends Interface2 {

    default void methodC() {
        System.out.println("Inside Method C");
    }

}
