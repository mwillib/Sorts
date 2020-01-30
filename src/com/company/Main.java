package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int arrayLength = 7;
        int[] array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            array[i] = (int) (Math.random()*10);
        }

        Selection.main(array);

        for(int i = 0; i < arrayLength; i++){
            array[i] = (int) (Math.random()*10);
        }

        Insertion.main(array);

//        for(int i = 0; i < arrayLength; i++){
//            array[i] = (int) (Math.random()*10);
//        }
        array = new int[]{4,2,5,1,7,6,3};
        Merge.main(array);

    }
}
