package com.ua.homework07;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int numberForCube = 5;
        System.out.println("1. Cube of number "+numberForCube+" = "+main.getCubeOfNumber(numberForCube));
        System.out.println("----------------------");
        int countStar = 10;
        System.out.print("2. Print countStar "+countStar+" = ");
        main.printStar(countStar);
        System.out.println("----------------------");
    }

    int getCubeOfNumber (int num){
        return num*num*num;
    }

    void printStar (int cnt){
        for (int i = 1; i < cnt; i++) {
            System.out.print("*");
            }
    }

}
