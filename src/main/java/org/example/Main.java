package org.example;

import static org.example.Functions.createRandomIntArray;
import static org.example.Functions.printArray;
import static org.example.algos.BubbleSort.bubbleSort;
import static org.example.algos.QuickSort.quickSort;

public class Main {
    private static final int arraySize = 10;
    private static final int bound = 1000;

    public static void main(String[] args) {
        int[] randomArray = createRandomIntArray(arraySize, bound);
        System.out.println("Shuffled array:");
        printArray(randomArray);
        System.out.println("Quick Sort:");
        printArray(quickSort(randomArray));
        System.out.println("Bubble Sort:");
        printArray(bubbleSort(randomArray));
    }
}