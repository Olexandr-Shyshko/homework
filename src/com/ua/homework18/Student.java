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
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String toString() {
        return "Student {id=" + this.id + ", name='" + this.name + "', surName='" + this.surName + "', groupName='" + this.groupName + "'}";
    }
}
