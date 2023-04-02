package com.ua.homework23;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<SurName> nameList = new ArrayList<>();
        nameList.add(new SurName("Ivanov"));
        nameList.add(new SurName("Petrov"));
        nameList.add(new SurName("Sidorov"));
        nameList.add(new SurName("Ivanov"));
        nameList.add(new SurName("Petrov"));
        nameList.add(new SurName("Petrov"));
        nameList.add(new SurName("Sidorov"));
        nameList.add(new SurName("Ivanov"));
        nameList.add(new SurName("Sidorov"));
        nameList.add(new SurName("Petrov"));
        nameList.add(new SurName("Petrov"));
        nameList.add(new SurName("Sidorov"));
        nameList.add(new SurName("Ivanov"));
        nameList.add(new SurName("Petrov"));
        nameList.add(new SurName("Petrov"));
        nameList.add(new SurName("Sidorov"));
        nameList.add(new SurName("Ivanov"));
        nameList.add(new SurName("Sidorov"));
        nameList.add(new SurName("Petrov"));
        nameList.add(new SurName("Ivanov"));
        System.out.println("1. Original list SurName:");
        System.out.println(nameList);

        Map<String,Long> nameIntegerMap =nameList.stream()
                .collect(Collectors.groupingBy(SurName::getSurName,Collectors.counting()));
        System.out.println("Grouping by SurName:");
        System.out.println(nameIntegerMap);

        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <10 ; i++) {
            int number = random.nextInt(0,5);
            integerList.add(number);
        }
        System.out.println();
        System.out.println("2. Original list Integer:");
        System.out.println(integerList);
        int sumInt =integerList.stream().mapToInt(Integer::intValue).sum();
        // or: int sumInt =integerList.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum : "+sumInt);

    }
}
