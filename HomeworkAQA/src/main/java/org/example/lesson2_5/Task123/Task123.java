package org.example.lesson2_5.Task123;

public class Task123 {

    public static void myArray(String[][] array) {
        int[][] arrayOfNumbers = new int[4][4];
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Количество строк должно быть 4");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("В строке " + i + " не 4 элемента");
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrayOfNumbers[i][j] = Integer.parseInt(array[i][j]);
                    sum = sum + arrayOfNumbers[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                System.out.print(arrayOfNumbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма элементов массива = " + sum);
    }
}