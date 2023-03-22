package com.ua.homework19;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set <Integer> hashSet = new HashSet<>(1000);
        Set <Integer> linkedHashSet = new LinkedHashSet<>(1000);
        Set <Integer> treeSet = new TreeSet<>();
        Random random = new Random();
        for (int i = 1; i <= 1000; i++) {
            int number = random.nextInt(1,51);
            hashSet.add(number);
            linkedHashSet.add(number);
            treeSet.add(number);
        }
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
