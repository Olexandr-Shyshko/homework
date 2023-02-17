package com.ua.homework12;

public class Child extends Parent{
    private int age;

    {
        System.out.println(4);
    }

    static {
        System.out.println(2);
    }
    public Child(String name, int age) {
        super(name);
        this.age = age;
    }

    public Child() {
    }
}
