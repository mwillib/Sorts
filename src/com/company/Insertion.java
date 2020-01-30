package com.company;

import java.util.Arrays;

public class Insertion {
    public static void main(int[] array) {
        System.out.println("Insertion Sort:");
        System.out.println("Starting Array: " + Arrays.toString(array));


        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > temp)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
