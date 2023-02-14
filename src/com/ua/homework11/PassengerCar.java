package com.ua.homework11;

public class PassengerCar extends Car {
    private String transmission;

    public PassengerCar(String model, String color, int year, float engine, String type, String transmission) {
        super(model, color, year, engine, type);
        this.transmission = transmission;
    }

    @Override
    public String showTypeCar() {
        return "Type of Passenger Car: " + super.getType();
    }
}
