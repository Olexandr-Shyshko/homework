package com.ua.homework18;

public class Student {
    private int id;
    private String name;
    private String surName;
    private String groupName;

    public Student() {
    }

    public Student(int id, String name, String surName, String groupName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
