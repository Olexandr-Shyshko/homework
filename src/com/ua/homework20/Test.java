package com.ua.homework20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слово: ");
        String word = scanner.nextLine();

        Map<String, List<String>> map = new HashMap<>();
        map.put("Ноутбук", List.of("Laptop", "ラップトップ", "Laptop"));
        map.put("Чашка", List.of("Cup", "カップ", "Tasse"));
        map.put("Карта", List.of("Map", "地図", "Karte"));
        map.put("Стакан", List.of("Glass", "ガラス", "Glas"));
        map.put("Мавпа", List.of("Monkey", "猿", "Affe"));
        map.put("Дерево", List.of("Tree", "木", "Baum"));
        map.put("Корова", List.of("Cow", "牛", "Kuh"));
        map.put("Сир", List.of("Cheese", "チーズ", "Käse"));
        map.put("Йогурт", List.of("Yogurt", "ヨーグルト", "Joghurt"));
        map.put("Сметана", List.of("Sour cream", "サワークリーム", "Sauerrahm"));

        getTranslate(word, map);
    }

    static void getTranslate(String word, Map<String, List<String>> map) {
        if (map.containsKey(word)) {
            System.out.println("Слово: " + word + " - Переклад: " + map.get(word));
        } else {
            System.out.println("Слово: " + word + " - Переклад: " + "Немає перекладу такого слова");
        }
    }
}
