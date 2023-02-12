package com.ua.homework10;

import java.util.List;

public class Teacher {
    private String name;
    private String surName;
    private String subject;
    private String academicTitle;
    private int salary;
    private List<Student> studentList;

    public Teacher(String name, String surName, String subject, String academicTitle, int salary) {
        this.name = name;
        this.surName = surName;
        this.subject = subject;
        this.academicTitle = academicTitle;
        this.salary = salary;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Student> getStudentList() {
        return studentList;
    }


    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", subject='" + subject + '\'' +
                ", academicTitle='" + academicTitle + '\'' +
                ", salary=" + salary +
                ", studentList=" + studentList +
                '}';
    }
}