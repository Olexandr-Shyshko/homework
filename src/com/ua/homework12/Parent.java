package com.ua.homework12;

public class Parent {
    public String name;

    {
        System.out.println(3);
    }

    static {
        System.out.println(1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent(String name) {
        this.name = name;
    }

    public Parent() {
    }
}
