package com.ua.homework10;

public class Student {
    private String name;
    private String surName;
    private int course;
    private String specialty;

    public Student(String name, String surName, int course, String specialty) {
        this.name = name;
        this.surName = surName;
        this.course = course;
        this.specialty = specialty;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", course=" + course +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
