package com.ua.lesson13.entity;

public class Student {
    private String name;
    private String surName;
    private int mark;

    public Student() {
    }

    public Student(String name, String surName, int mark) {
        this.name = name;
        this.surName = surName;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", mark=" + mark +
                '}';
    }
}
