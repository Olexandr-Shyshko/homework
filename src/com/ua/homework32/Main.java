package com.ua.homework32;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThreadRunnable());
        thread1.setName("FirstThread");
        Thread thread2 = new Thread(new MyThreadRunnable());
        thread2.setName("SecondThread");
        thread1.start();
        thread2.start();
    }
}
