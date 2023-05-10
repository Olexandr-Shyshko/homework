package com.ua.homework34;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    public String call() throws Exception {
        int number = (new Random()).nextInt(1, 51);
        String var10000 = Thread.currentThread().getName();
        String result = "Потік " + var10000 + " виводить число: " + number;
        return result;
    }
}

