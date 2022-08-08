package org.example.algos;

import java.util.Random;

import static org.example.Functions.swap;

public class QuickSort {
    public static int[] quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private static void quickSort(int[] array, int firstElement, int lastElement) {
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
}
