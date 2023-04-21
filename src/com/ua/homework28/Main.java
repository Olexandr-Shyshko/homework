package com.ua.homework28;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static final String FILE_NAME = "file2.txt";

    public static void main(String[] args) {
        List<String> listText = List.of("If this be error and upon me proved", "I never writ, nor no man ever loved.");
        saveToFile(listText, FILE_NAME);
        System.out.println(readFromFile(FILE_NAME));
    }

    static void saveToFile(List<String> str, String fileName) {
        Path file = Path.of(fileName);
        try {
            Files.write(file, str);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    static List<String> readFromFile(String fileName) {
        Path file = Path.of(fileName);
        List<String> result = null;
        try {
            result = Files.readAllLines(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}

