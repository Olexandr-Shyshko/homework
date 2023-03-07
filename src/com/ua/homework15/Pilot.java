package com.ua.homework15;

public class Pilot extends Human implements Driveable, Flyable {
    private AirCraft airCraft;
    private int hoursFlying;

    public Pilot(String name, String surName, int age, AirCraft airCraft, int hoursFlying) {
        super(name, surName, age);
        this.airCraft = airCraft;
        this.hoursFlying = hoursFlying;
    }

    @Override
    public String toString() {
        return "Pilot{" + "airCraft=" + airCraft + ", hoursFlying=" + hoursFlying + '}';
    }

    public AirCraft getAirCraft() {
        return airCraft;
    }

    public void setAirCraft(AirCraft airCraft) {
        this.airCraft = airCraft;
    }

    public int getHoursFlying() {
        return hoursFlying;
    }

    public void setHoursFlying(int hoursFlying) {
        this.hoursFlying = hoursFlying;
    }

    @Override
    public void drive() {
        System.out.println("По дорозі їде пілот");
    }

    @Override
    public void fly() {
        System.out.println("Пілот управляє літаком");
    }
}

class AirCraft {
    private String type;

    public AirCraft(String type) {
        this.type = type;
    }
}