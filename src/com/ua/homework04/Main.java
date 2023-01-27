package com.ua.homework04;

public class Main {
    public static void main(String[] args) {
        String line = "sdTy77YnnR55i";
        System.out.println("To UpperCase: "+line.toUpperCase());
        System.out.println("To LowerCase: "+line.toLowerCase());
        int lastCharacter = line.length()-1;
        System.out.println("First character: "+line.charAt(0));
        System.out.println("Last character: "+line.charAt(lastCharacter));

    }
}
