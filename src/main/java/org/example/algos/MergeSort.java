package org.example.algos;


public class MergeSort {
    public static int[] mergeSort(int[] array) {
        if (array == null) {
            return null;
        } else if (array.length == 1) {
            return array;
        } else {
            int[] arrayLeft = new int[array.length / 2];
            System.arraycopy(array, 0, arrayLeft, 0, array.length / 2);
            int[] arrayRight = new int[array.length - array.length / 2];
            System.arraycopy(array, array.length / 2, arrayRight, 0, array.length - array.length / 2);
            arrayLeft = mergeSort(arrayLeft);
            arrayRight = mergeSort(arrayRight);
            return sortChunks(arrayLeft, arrayRight);
        }
    }

    private static int[] sortChunks(int[] arrayA, int[] arrayB) {
        int[] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0, positionB = 0;
        for (int i = 0; i < arrayA.length + arrayB.length; i++) {
            if (positionA == arrayA.length || arrayA[i - positionA] > arrayB[i - positionB]) {
                arrayC[i] = arrayB[positionB++];
            } else {
                arrayC[i] = arrayA[positionA++];
            }
        }
        return arrayC;
    }
}
