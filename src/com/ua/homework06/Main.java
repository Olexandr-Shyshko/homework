package com.ua.homework06;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Числа від 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("______________________");
        System.out.println("2. Всі парні числа від 1 до 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("______________________");
        System.out.print("3. Факторіал числа 7 = ");
        int numFactorial = 7;
        int cntFactorial = 1;
        int rezFactorial = 1;
        while (cntFactorial <= numFactorial) {
            rezFactorial = rezFactorial * cntFactorial;
            cntFactorial++;
        }
        System.out.println(rezFactorial);
    }
}

