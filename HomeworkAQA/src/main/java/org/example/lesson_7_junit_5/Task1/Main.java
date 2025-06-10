package org.example.lesson_7_junit_5.Task1;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Факториал числа = " + factorial.calculateFactorial(4));
    }
}