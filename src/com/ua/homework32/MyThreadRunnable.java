package com.ua.homework32;

public class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Потік "+Thread.currentThread().getName()+" виводить число: "+i);
        }
    }
}
