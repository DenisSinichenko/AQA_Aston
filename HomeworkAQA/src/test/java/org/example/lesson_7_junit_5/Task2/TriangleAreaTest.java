package org.example.lesson_7_junit_5.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaTest {
    TriangleArea triangleArea = new TriangleArea();

    @Test
    void testTriangleAreaWithPositiveNumbers() {
        assertEquals(10.0, triangleArea.calculateTriangleArea(4, 5));
    }

    @Test
    void testTriangleAreaWithZeroHeight() {
        try {
            triangleArea.calculateTriangleArea(5, 0);
            fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Основание и высота должны быть больше 0", e.getMessage());
        }
    }

    @Test
    void testTriangleAreaWithZeroBase() {
        try {
            triangleArea.calculateTriangleArea(0, 5);
            fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Основание и высота должны быть больше 0", e.getMessage());
        }
    }

    @Test
    void testTriangleAreaWithNegativeValues() {
        try {
            triangleArea.calculateTriangleArea(-4, 5);
            fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Основание и высота должны быть больше 0", e.getMessage());
        }
    }
}