package org.example.lesson2_2;

public class Task14 {
    public int[] initValueArray(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}