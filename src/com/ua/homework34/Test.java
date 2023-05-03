package com.ua.homework34;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Callable<String>> callableList = new ArrayList();
        int countCallableObject = (new Random()).nextInt(20, 75);

        for (int i = 0; i < countCallableObject; ++i) {
            callableList.add(new MyCallable());
        }

        List<Future<String>> futureList = executorService.invokeAll(callableList);
        futureList.stream().forEach((x) -> {
            try {
                System.out.println((String) x.get());
            } catch (InterruptedException var2) {
                throw new RuntimeException(var2);
            } catch (ExecutionException var3) {
                throw new RuntimeException(var3);
            }
        });
        executorService.shutdown();
    }
}
