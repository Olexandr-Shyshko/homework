package com.ua;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homework25 {
    public static void main(String[] args) {
        boolean isNumber = false;
        while  (!isNumber) {
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введіть число: ");
                int number = scanner.nextInt();
                System.out.println("Ви ввели: "+number);
                isNumber = true;
            }
            catch (InputMismatchException e){
                System.out.println("Можна вводити лише числа!");
                isNumber = false;
            }
        }
    }
}
