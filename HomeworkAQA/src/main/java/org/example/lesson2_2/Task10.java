package org.example.lesson2_2;

public class Task10 {
    public void replaceNumberInArray() {
        int[] array = {0, 1, 0, 1, 1, 0, 1, 0, 0};
        System.out.println("Задан массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nИзмененный массив: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}