package com.ua.homework07;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int numberForCube = 3;
        System.out.println("1. Cube of number "+numberForCube+" = "+main.getCubeOfNumber(numberForCube));
        System.out.println("----------------------");
        int countStar = 6;
        System.out.print("2. Print countStar "+countStar+" : ");
        main.printStar(countStar);
        System.out.println("----------------------");
        int countSymbol = 4;
        String symbol = "#";
        System.out.print("3. Print countSymbol "+countSymbol+" : ");
        main.printSymbol(countSymbol,symbol);
    }

    int getCubeOfNumber (int num){
        return num*num*num;
    }

    void printStar (int cnt){
        for (int i = 0; i < cnt; i++) {
            System.out.print("*");
            }
        System.out.println();
    }
    void printSymbol (int cnt, String str){
        for (int i = 0; i < cnt; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

}
