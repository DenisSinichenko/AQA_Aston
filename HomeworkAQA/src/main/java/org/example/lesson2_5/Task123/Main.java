package org.example.lesson2_5.Task123;

public class Main {
    public static void main(String[] args) {
        String[][] testArray = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            Task123.myArray(testArray);
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}