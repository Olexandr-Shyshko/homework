package com.ua.homework07;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int numberForCube = 5;
        System.out.println("Cube of number "+numberForCube+" = "+main.getCubeOfNumber(numberForCube));

    }

    int getCubeOfNumber (int num){
        return num*num*num;
    }

}
