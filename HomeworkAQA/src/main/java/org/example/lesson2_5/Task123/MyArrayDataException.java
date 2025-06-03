package org.example.lesson2_5.Task123;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j, String n) {
        super("Значение в ячейке [" + i + "][" + j + "]: '" + n + "' не является числом!");
    }
}