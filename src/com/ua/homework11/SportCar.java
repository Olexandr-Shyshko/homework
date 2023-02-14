package com.ua.homework11;

public class SportCar extends Car {
    private String transmission;

    public SportCar(String model, String color, int year, float engine, String type, String transmission) {
        super(model, color, year, engine, type);
        this.transmission = transmission;
    }

    @Override
    public String getType() {
        return "Type of this car: " + super.getType();
    }
}
