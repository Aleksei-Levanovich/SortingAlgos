package org.example;

import java.util.Arrays;
import java.util.Random;

public class Functions {
    public static void swap(int[] array, int position1, int position2) {
        if (position1 == position2) {
            return;
        }
        int buffer = array[position1];
        array[position1] = array[position2];
        array[position2] = buffer;
    }

    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] createRandomIntArray(int size, int bound) {
        int[] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = new Random().nextInt(bound);
        }
        return randomArray;
    }
}
