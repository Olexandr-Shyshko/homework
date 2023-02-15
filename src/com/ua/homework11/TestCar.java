package com.ua.homework11;

public class TestCar {
    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar("BMV","Red", 2022,2.0f,"Sport Car","Mechanical");

        System.out.println(passengerCar.showTypeCar());

        TruckCar truckCar = new TruckCar("Man","Black",1996, 6.9f,"Wagon",true);

        System.out.println(truckCar.showTypeCar());
    }

}
