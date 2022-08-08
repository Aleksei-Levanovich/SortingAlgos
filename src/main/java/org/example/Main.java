package org.example;

import java.util.Random;

import static org.example.algos.QuickSort.quickSort;

public class Main {
    private static final int arraySize = 10;
    private static final int bound = 1000;

    public static void main(String[] args) {
        int[] randomArray = createRandomIntArray();
        quickSort(randomArray);
        printArray(randomArray);
    }



    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static int[] createRandomIntArray(){
        int[] randomArray = new int[Main.arraySize];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = new Random().nextInt(bound);
        }
        return randomArray;
    }
}