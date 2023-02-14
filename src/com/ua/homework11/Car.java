package com.ua.homework11;

public class Car {
    private String model;
    private String color;
    private int year;
    private float engine;
    private String type;

    public String getType() {
        return type;
    }

    public String showTypeCar() {
        return "Car";
    }

    public Car(String model, String color, int year, float engine, String type) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.type = type;
    }
}
