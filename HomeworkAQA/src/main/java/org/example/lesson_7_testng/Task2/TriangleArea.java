package org.example.lesson_7_testng.Task2;

public class TriangleArea {
    public double calculateTriangleArea(double a, double h) {
        if (a <= 0 || h <= 0) {
            throw new IllegalArgumentException("Основание и высота должны быть > 0");
        }
        return 0.5 * a * h;
    }
}