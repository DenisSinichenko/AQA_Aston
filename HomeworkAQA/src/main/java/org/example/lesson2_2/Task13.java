package org.example.lesson2_2;

public class Task13 {
    public void zapolnenieDiagonalei(){
        int[][] array = new int [10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}