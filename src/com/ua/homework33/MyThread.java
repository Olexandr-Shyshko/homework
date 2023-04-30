package com.ua.homework33;

import java.util.Random;

public class MyThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            int number = random.nextInt(1, 11);
            System.out.println(number);
            if (number == 5) {
                Thread.currentThread().interrupt();
                if (Thread.currentThread().isInterrupted()) {
                    return;
                }
            }
        }
    }
}
