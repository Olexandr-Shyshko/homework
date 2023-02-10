package com.ua.homework10;

public class TestArray {
    public static void main(String[] args) {
        Array array = new Array();
        array.setLength(13);
        int[] ints = array.createArray(array.getLength());
        array.printArray(ints);

        ints = array.sortArrayAsk(ints);
        array.printArray(ints);

        ints = array.sortArrayDesk(ints);
        array.printArray(ints);


    }
}
