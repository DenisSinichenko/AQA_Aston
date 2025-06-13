package org.example.lesson_7_junit_5.Task3;

public class Calculator {
    public int sumNumbers(int a, int b) {
        return a + b;
    }

    public int difNumbers(int a, int b) {
        return a - b;
    }

    public int divNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return a / b;
    }

    public int mulNumbers(int a, int b) {
        return a * b;
    }
}