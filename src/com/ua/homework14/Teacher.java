package com.ua.homework14;

public class Teacher extends ParticipantsEducation {
    @Override
    public String askQuestion() {
        return "Teacher ask: You understand?";
    }

    @Override
    public void goToLectures() {
        System.out.println("Teacher go to lecture");
    }

    @Override
    public int getReceiveMoney() {
        int cntHours = 176;
        int hourlyRate = 96;
        return cntHours * hourlyRate;
    }

    public Teacher() {
    }

    public Teacher(String name, String surName, int age, String title) {
        super(name, surName, age, title);
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "name='" + getName() + '\'' +
                ", surName='" + getSurName() + '\'' +
                ", age=" + getAge() +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
