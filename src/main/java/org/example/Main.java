package org.example;

import java.util.Random;

import static org.example.Functions.printArray;
import static org.example.algos.BubbleSort.bubbleSort;
import static org.example.algos.QuickSort.quickSort;

public class Main {
    private static final int arraySize = 10;
    private static final int bound = 1000;

    public static void main(String[] args) {
        int[] randomArray = createRandomIntArray();
        printArray(quickSort(randomArray));
        printArray(bubbleSort(randomArray));
    }

    private static int[] createRandomIntArray() {
        int[] randomArray = new int[Main.arraySize];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = new Random().nextInt(bound);
        }
        return randomArray;
    }
}