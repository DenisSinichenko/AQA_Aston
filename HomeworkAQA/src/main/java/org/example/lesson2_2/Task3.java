package org.example.lesson2_2;

public class Task3 {
    public void printColor() {
        int value = 140;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }
}
