package com.ua.homework14;

public abstract class ParticipantsEducation {
    private String name;
    private String surName;
    private int age;
    private String title;

    public abstract String askQuestion();

    public abstract void goToLectures();

    public abstract int getReceiveMoney();

    public ParticipantsEducation() {
    }

    public ParticipantsEducation(String name, String surName, int age, String title) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }
}
