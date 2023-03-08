package com.ua.homework17;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int numberDay = random.nextInt(1, 8);
        System.out.print("Number of day "+numberDay+" : ");
        DaysOfWeek.getNameOfDay(numberDay);
    }
}
