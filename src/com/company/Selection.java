package com.company;

import java.util.Arrays;

public class Selection {
    public static void main(int[] array) {
        System.out.println("Selection Sort:");
        System.out.println("Starting Array: " + Arrays.toString(array));


        for(int i = 0; i < array.length; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        System.out.println("Sorted Array: " +   Arrays.toString(array));
    }
}
