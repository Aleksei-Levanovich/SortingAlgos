package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int arraySize = 1000;

    public static void main(String[] args) {
        int[] randomArray = new int[arraySize];
        for (int i = 0; i< randomArray.length; i++){
            randomArray[i] = (int) (Math.random()*100);
        }
        quickSort(randomArray, 0, randomArray.length-1);
        printArray(randomArray);
    }

    private static void quickSort(int[] array, int leftBorder, int rightBorder){
        if (leftBorder >= rightBorder){
            return;
        }
        int randomElement = new Random().nextInt(rightBorder - leftBorder) + leftBorder;
        swap(array, randomElement, rightBorder);
        randomElement = array[rightBorder];

        int leftPointer = leftBorder;
        int rightPointer = rightBorder-1;

        while (leftPointer < rightPointer){
            while (array[leftPointer] <= randomElement && leftPointer < rightPointer){
                leftPointer++;
            }

            while (array[rightPointer] >= randomElement && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        if(array[leftPointer] > randomElement) {
            swap(array, leftPointer, rightBorder);
        }
        else {
            leftPointer = rightBorder;
        }
        quickSort(array, leftBorder, leftPointer-1);
        quickSort(array, leftPointer+1, rightBorder);
    }

    private static void swap(int[] array, int position1, int position2){
        if (position1 == position2){
            return;
        }
        int buffer = array[position1];
        array[position1] = array[position2];
        array[position2] = buffer;
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}