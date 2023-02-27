package com.ua.homework14;

public class Test {
    public static void main(String[] args) {
        ParticipantsEducation student = new Student("Vlad", "Ivanov", 22, "Bachelor");
        System.out.println(student.toString());
        System.out.println(student.askQuestion());
        student.goToLectures();
        System.out.println(student.getReceiveMoney());
        System.out.println("______________________________");
        ParticipantsEducation teacher = new Teacher("Peter", "Sidorov", 49, "PhD");
        System.out.println(teacher.toString());
        System.out.println(teacher.askQuestion());
        teacher.goToLectures();
        System.out.println(teacher.getReceiveMoney());
    }
}
