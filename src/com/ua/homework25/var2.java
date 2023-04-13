package com.ua.homework25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class var2 {
    public static void main(String[] args) {
        boolean isNumber = false;
        while  (!isNumber) {
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введіть число: ");
                String line = scanner.nextLine();
                int number = Integer.parseInt(line);
                System.out.println("Ви ввели: "+number);
                isNumber = true;
            }
            catch (NumberFormatException e){
                System.out.println("Можна вводити лише числа!");
                isNumber = false;
            }
        }
    }
}
