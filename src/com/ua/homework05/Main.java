package com.ua.homework05;

public class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int max, min;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        System.out.println("Введені числа: a = " + a + "; b= " + b);
          if (a == b){
            System.out.println("Числа a та b рівні");
        } else {
            System.out.println("Більше число: "+max);
            System.out.println("Менше число:  "+min);
        }

    }
}
