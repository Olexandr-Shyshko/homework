package com.ua.homework05;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int x = 7;
        boolean isEven = (x % 2 == 0);
        int max, min;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        System.out.println("Введені числа: a = " + a + "; b = " + b+ "; x = " + x);
          if (a == b){
            System.out.println("Числа a та b рівні");
          } else {
            System.out.println("Більше число: "+max);
            System.out.println("Менше число:  "+min);
        }
        System.out.println("------------------------");
        if (isEven) {
            System.out.println("Число x парне");
        }
            else {
            System.out.println("Число x непарне");
            }
        }
}
