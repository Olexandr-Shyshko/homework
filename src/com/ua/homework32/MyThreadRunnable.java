package com.ua.homework32;

public class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Потік "+Thread.currentThread().getName()+" виводить число: "+i);
        }
    }
}
