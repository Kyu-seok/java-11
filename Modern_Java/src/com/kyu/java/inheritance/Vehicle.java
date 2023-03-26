package com.kyu.java.inheritance;

public abstract class Vehicle {

    // Abstract method for starting the vehicle
    public abstract void start();

    // Method for stopping the vehicle
    public void stop() {
        System.out.println("Vehicle stopped.");
    }

}
