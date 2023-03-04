package com.ua.homework15;

public class Driver extends Human implements Driveable, Flyable {
    private Car car;
    private int drivingExperience;

    public Driver(String name, String surName, int age, Car car, int drivingExperience) {
        super(name, surName, age);
        this.car = car;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "car=" + car +
                ", drivingExperience=" + drivingExperience +
                '}';
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }


    @Override
    public void drive() {
        System.out.println("По дорозі їде водій");
    }

    @Override
    public void fly() {
        System.out.println("По дорозі \"летить\" \"Шумахер\"");
    }
}


class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }
}