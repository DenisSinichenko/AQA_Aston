package org.example.lesson_7_junit_5.Task4;

public class CompareNumbers {
    public static String compareNumbers(int a, int b){
        if (a > b) {
            return a + " > " + b;
        } else if (a < b) {
            return a + " < " + b;
        } else {
            return a + " = " + b;
        }
    }
}