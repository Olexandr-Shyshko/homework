package com.ua.homework22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ivanov",3.45);
        Student st2 = new Student("Petrov",5.09);
        Student st3 = new Student("Babaev",9.5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        System.out.println("Original list:");
        System.out.println(studentList);
        System.out.println("Sort by surName:");
        studentList.sort((o1,o2)-> o1.getSurName().compareTo(o2.getSurName()));
        System.out.println(studentList);
        // or: studentList.stream().sorted(Comparator.comparing(Student::getSurName)).forEach(System.out::println);
        System.out.println("Sort by avgScore:");
        studentList.sort((o1, o2) -> (int) (o1.getAvgScore()-o2.getAvgScore()));
        System.out.println(studentList);
        // or: studentList.stream().sorted(Comparator.comparing(Student::getAvgScore)).forEach(System.out::println);
    }

}
