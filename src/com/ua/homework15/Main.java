package com.ua.homework15;

public class Main {
    public static void main(String[] args) {
        Driveable driver1 = new Driver("Ivan", "Petrov", 25, new Car("BMV"), 3);
        Driveable driver2 = new Pilot("Sergey", "Sidorov", 44, new AirCraft("Boing"), 14567);

        driver1.drive();
        driver2.drive();

        System.out.println("________________________________");

        Flyable flyer1 = new Driver("Shumaher", "******", 18, new Car("F1"), 2);
        Flyable flyer2 = new Pilot("Vasya", "Pupkin", 56, new AirCraft("Fighter"), 63246);

        flyer1.fly();
        flyer2.fly();

    }
}
