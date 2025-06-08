package org.example.lesson2_2;

public class Task11 {
    public void array100(){
        int array[] = new int[100];
        System.out.println("Заполненный массив числами от 1 до 100: \n");
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }
}