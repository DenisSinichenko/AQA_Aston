package org.example.lesson_7_testng.Task3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Сумма чисел = " + calculator.sumNumbers(5,5));
        System.out.println("Разность чисел = " + calculator.difNumbers(5,5));
        System.out.println("Результат деления = " + calculator.divNumbers(5,5));
        System.out.println("Результат умножения = " + calculator.mulNumbers(5,5));
    }
}