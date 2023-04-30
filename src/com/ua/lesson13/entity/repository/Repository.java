package com.ua.lesson13.entity.repository;

import com.ua.lesson13.entity.Student;

import java.util.Random;

public class Repository {
    public static final int size_array = 10;
    private Student[] studentArray = new Student[size_array];

    public Student[] findAllStudents() {
        return studentArray;
    }

    public void save(Student student) {
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] == null) {
                studentArray[i] = student;
                break;
            }

        }
    }

    private static String generateRandomString(int size) {
        String str = "abcdefghigklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < random.nextInt(1, 3); j++) {
                stringBuilder.append(str.charAt(random.nextInt(0, str.length())));
            }
        }
        stringBuilder.setCharAt(0, Character.toUpperCase(str.charAt(0)));
        return str.toString();
    }

}
