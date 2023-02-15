package com.ua.homework11;

public class TruckCar extends Car{
    private boolean isHaveTrailer;
    public TruckCar(String model, String color, int year, float engine, String type, boolean isHaveTrailer) {
        super(model, color, year, engine, type);
        this.isHaveTrailer=isHaveTrailer;
    }

    @Override
    public String showTypeCar() {
        return "Type of Truck Car: " + super.getType();
    }
}
