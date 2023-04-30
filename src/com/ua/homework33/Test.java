package com.ua.homework33;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
    }
}
