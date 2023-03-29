package com.ua.homework18;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
    Random random = new Random();
    List<Integer> list1 = new ArrayList();
    int capacity1 = 10;

    int capacity2;
        for(int i = 0; i < capacity1; ++i) {
        capacity2 = random.nextInt(50);
        list1.add(capacity2);
    }

        System.out.println(list1);
        System.out.println("---------------------------------");
    LinkedList<Integer> list2 = new LinkedList();
    capacity2 = 2000000;

        for(int i = 0; i < capacity2; ++i) {
        int number = random.nextInt(2);
        list2.addLast(number);
    }

        System.out.println(list2);
        System.out.println("---------------------------------");
    List<com.ua.homework18.Student> studentList1 = new ArrayList();
    com.ua.homework18.Student st1 = new com.ua.homework18.Student(1, "Ira", "Ivanova", "UP-19");
        studentList1.add(st1);
        System.out.println(st1);
        System.out.println("---------------------------------");
    List<com.ua.homework18.Student> studentList2 = new LinkedList();
    com.ua.homework18.Student st2 = new Student(2, "Ivan", "Petrov", "FK-17");
        studentList2.add(st2);
        System.out.println(st2);
}
}
