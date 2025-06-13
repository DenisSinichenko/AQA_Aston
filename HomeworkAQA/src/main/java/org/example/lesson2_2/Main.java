package org.example.lesson2_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        Task7 task7 = new Task7();
        Task8 task8 = new Task8();
        Task9 task9 = new Task9();
        Task10 task10 = new Task10();
        Task11 task11 = new Task11();
        Task12 task12 = new Task12();
        Task13 task13 = new Task13();
        Task14 task14 = new Task14();
        System.out.println("------------------------------------------------------------");
        task1.printThreeWords();
        System.out.println("------------------------------------------------------------");
        task2.checkSumSign();
        System.out.println("------------------------------------------------------------");
        task3.printColor();
        System.out.println("------------------------------------------------------------");
        task4.compareNumbers();
        System.out.println("------------------------------------------------------------");
        System.out.println(task5.compareSum(5,89));
        System.out.println("------------------------------------------------------------");
        task6.positivOrNegativNumber(-8);
        System.out.println("------------------------------------------------------------");
        System.out.println(task7.positivOrNegativNumber(-9));
        System.out.println("------------------------------------------------------------");
        task8.printStringCount("Hello",4);
        System.out.println("------------------------------------------------------------");
        System.out.println(task9.visokosnyiYear(2016));
        System.out.println("-------------------------------------------------------------");
        task10.replaceNumberInArray();
        System.out.println("\n------------------------------------------------------------");
        task11.array100();
        System.out.println("\n------------------------------------------------------------");
        task12.multiplyInArray2();
        System.out.println("\n------------------------------------------------------------");
        task13.zapolnenieDiagonalei();
        System.out.println("------------------------------------------------------------");
        System.out.println(Arrays.toString(task14.initValueArray(5,7)));
        System.out.println("------------------------------------------------------------");
    }
}