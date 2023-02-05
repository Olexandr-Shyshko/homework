package com.ua.homework08;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = setArray(-100, 100);
        System.out.println("1. Create array with 10 elements");
        //---------------------------------------
        System.out.print("2. Print array:  ");
        printArray(array);
        System.out.println();
        //---------------------------------------
        System.out.println("3. Get Min element: " + getMinElement(array));
        System.out.println("4. Get Max element: " + getMaxElement(array));
        System.out.println("5. Get Avg element: " + getAvgArr(array));
        System.out.println("6. Get Sum element: " + getSumElement(array));

    }

    static int[] setArray(int minRandom, int maxRandom) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(minRandom, maxRandom);
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "  ");
        }
    }

    static int getMinElement(int[] arr) {
        int minElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElem) {
                minElem = arr[i];
            }
        }
        return minElem;
    }

    static int getMaxElement(int[] arr) {
        int maxElem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElem) {
                maxElem = arr[i];
            }
        }
        return maxElem;
    }

    static int getSumElement(int[] arr) {
        int sumElem = 0;
        for (int elem : arr) {
            sumElem += elem;
        }
        return sumElem;
    }

    static float getAvgArr(int[] arr) {
        return ((float) getSumElement(arr) / (float)arr.length);
    }
}

