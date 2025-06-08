package org.example.lesson2_5.Task4;

public class Task4 {
    public static void indexOutArray(int [] array){
        try {
            for (int i = 0; i < array.length; i++) {
                array[array.length + i] = 1000000000;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Исключение ArrayIndexOutOfBoundsException внутри метода indexOutArray(): " + e.getMessage());
            throw e;
        }
    }
}