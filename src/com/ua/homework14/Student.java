package com.ua.homework14;

public class Student extends ParticipantsEducation {

    @Override
    public String askQuestion() {
        return "Student ask: What are we learning today?";
    }

    @Override
    public void goToLectures() {
        System.out.println("Student go to lecture");
    }

    @Override
    public int getReceiveMoney() {
        return 2000;
    }

    public Student() {
    }

    public Student(String name, String surName, int age, String title) {
        super(name, surName, age, title);
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + getName() + '\'' +
                ", surName='" + getSurName() + '\'' +
                ", age=" + getAge() +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
