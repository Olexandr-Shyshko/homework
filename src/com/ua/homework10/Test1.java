package com.ua.homework10;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan","Petrov",3,"IT");
        Student student2 = new Student("Mariya","Sidorova",1,"HR");
        Student student3 = new Student("Taras","Ivanov",2,"Sales");
        System.out.println(student1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student2);

        Teacher teacher = new Teacher("Peter","Sokolov","HR","professor",1200);
        teacher.setStudentList(studentList);

        System.out.println(teacher);


    }
}
