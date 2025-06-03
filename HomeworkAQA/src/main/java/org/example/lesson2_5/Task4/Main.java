package org.example.lesson2_5.Task4;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1, 5, 6, 8};
        try {
            Task4.indexOutArray(testArray);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Обработка ошибки в Main: " + e.getMessage());
        }
    }
}