package org.example;

import java.util.Random;

public class Main {
    private static final int arraySize = 10;
    private static final int bound = 1000;

    public static void main(String[] args) {
        Integer[] randomArray = createRandomIntArray(arraySize);
        quickSort(randomArray);
        printArray(randomArray);
    }

    private static void quickSort(Integer[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(Integer[] array, int firstElement, int lastElement) {
        if (firstElement >= lastElement) {
            return;
        }

        int randomElementPosition = new Random().nextInt(lastElement - firstElement) + firstElement;

        swap(array, randomElementPosition, lastElement);
        int randomElement = array[lastElement];

        int leftPointer = firstElement;
        int rightPointer = lastElement - 1;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= randomElement && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= randomElement && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        if (array[leftPointer] > randomElement) {
            swap(array, leftPointer, lastElement);
        } else {
            leftPointer = lastElement;
        }
        quickSort(array, firstElement, leftPointer - 1);
        quickSort(array, leftPointer + 1, lastElement);
    }

    private static void swap(Integer[] array, int position1, int position2) {
        if (position1 == position2) {
            return;
        }
        int buffer = array[position1];
        array[position1] = array[position2];
        array[position2] = buffer;
    }

    private static void printArray(Integer[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static Integer[] createRandomIntArray(int arraySize){
        Integer[] randomArray = new Integer[arraySize];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = new Random().nextInt(bound);
        }
        return randomArray;
    }
}