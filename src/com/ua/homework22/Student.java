package com.ua.homework22;

import java.util.Objects;

public class Student {
    private String surName;
    private double avgScore;

    public Student(String surName, double avgScore) {
        this.surName = surName;
        this.avgScore = avgScore;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student {" +
                "surName='" + surName + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.avgScore, avgScore) == 0 && Objects.equals(surName, student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, avgScore);
    }
}
