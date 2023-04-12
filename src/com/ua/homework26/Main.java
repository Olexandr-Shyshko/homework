package com.ua.homework26;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(-5,5);
        System.out.println("Введене число: "+num);
        try{
            System.out.println("Квадрат числа "+num+" = "+squareOfNumber(num));
        }
        catch (NegativeNumberException e){
            System.out.println("Число "+num+ " < 0!");
        }

    }
    static int squareOfNumber (int number) throws NegativeNumberException {
        if (number<0) {
            throw new NegativeNumberException();
        }
        return number*number;
    }
}
