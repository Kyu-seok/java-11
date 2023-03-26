package com.kyu.java.inheritance;

public class Car extends Vehicle implements LandVehicle, WaterVehicle {

    // Implementing the abstract method from the Vehicle class
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    // Implementing the drive method from the LandVehicle interface
    @Override
    public void drive() {
        System.out.println("Car driving on land.");
    }

    // Implementing the navigate method from the WaterVehicle interface
    @Override
    public void navigate() {
        System.out.println("Car navigating on water");
    }
}
