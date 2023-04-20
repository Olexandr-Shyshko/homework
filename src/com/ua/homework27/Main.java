package com.ua.homework27;

import java.io.*;

public class Main {

    public static final String FILE_NAME = "file.txt";

    public static void main(String[] args) {
        String textLine = "If this be error and upon me proved,\n" +
                "I never writ, nor no man ever loved.";
        saveStringLineToFile(textLine);
        System.out.println(readFromFile(FILE_NAME));
    }

    static void saveStringLineToFile(String str) {
        try (OutputStream outputStream = new FileOutputStream(FILE_NAME);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);) {
            outputStreamWriter.write(str);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    static String readFromFile(String fileName) {
        String result = null;
        try (InputStream inputStream = new FileInputStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream);) {
            result = new String(inputStream.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}


