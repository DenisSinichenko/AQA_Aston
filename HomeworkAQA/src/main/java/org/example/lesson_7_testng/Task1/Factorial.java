package org.example.lesson_7_testng.Task1;

public class Factorial {
    public long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть >= 0");
        }
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}