package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creating a Scanner to set the Array's Length
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set Array Length:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        //Creating a New Random Array for each sort.
        for(int i = 0; i < arrayLength; i++){
            array[i] = (int) (Math.random()*10);
        }
        Selection.main(array);

        //Creating a New Random Array for each sort.
        for(int i = 0; i < arrayLength; i++){
            array[i] = (int) (Math.random()*10);
        }
        Insertion.main(array);
//        //Creating a New Random Array for each sort.
//        for(int i = 0; i < arrayLength; i++){
//            array[i] = (int) (Math.random()*10);
//        }
        array = new int[]{4,2,5,1,7,6,3};
        Merge.main(array);

    }
}
