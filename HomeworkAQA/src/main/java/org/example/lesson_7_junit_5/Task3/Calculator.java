package org.example.lesson_7_junit_5.Task3;

public class Calculator {
    public static int sumNumbers(int a, int b) {
        return a + b;
    }
    public static int difNumbers(int a, int b) {
        return a - b;
    }
    public static int divNumbers(int a, int b) {
        if(b == 0){
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return a / b;
    }
    public static int mulNumbers(int a, int b) {
        return a * b;
    }
}