package org.example.lesson_7_testng.Task2;

public class TriangleArea {
    public static double calculateTriangleArea(int a, int h) {
        if (a <= 0 || h <= 0) {
            throw new IllegalArgumentException("Стороны треугольника должны быть > 0");
        }
        return 0.5 * a * h;
    }
}