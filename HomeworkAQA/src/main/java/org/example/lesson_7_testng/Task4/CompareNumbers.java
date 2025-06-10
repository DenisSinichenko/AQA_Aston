package org.example.lesson_7_testng.Task4;

public class CompareNumbers {
    public String compareNumbers(int a, int b){
        if (a > b) {
            return a + " > " + b;
        } else if (a < b) {
            return a + " < " + b;
        } else {
            return a + " = " + b;
        }
    }
}