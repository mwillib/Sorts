package com.company;

import java.util.Arrays;

public class Merge {
    public static void main(int[] array) {
        System.out.println("Merge Sort:");
        System.out.println("Starting Array: " + Arrays.toString(array));

        System.out.println("Sorted Array: " + Arrays.toString(divide(array)));

    }

    private static int[] divide(int[] array) {
        int mid = array.length / 2;
        int[] result = new int[array.length];
        int[] left = new int[mid];
        int[] right;

        if (array.length <= 1) {
            return array;
        }

        if (array.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = array[mid + j];
        }

        left = divide(left);
        right = divide(right);

        result = merge(left, right);
        return result;
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer = 0, rightPointer = 0, resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                }
                else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
