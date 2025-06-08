package org.example.lesson_7_junit_5.Task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaTest {

    @Test
    void testTriangleAreaWithPositiveNumbers() {
        assertEquals(10.0, TriangleArea.calculateTriangleArea(4, 5));
    }

    @Test
    void testTriangleAreaWithZeroHeight() {
        assertEquals(0.0, TriangleArea.calculateTriangleArea(5, 0));
    }

    @Test
    void testTriangleAreaWithZeroBase() {
        assertEquals(0.0, TriangleArea.calculateTriangleArea(0, 5));
    }

    @Test
    void testTriangleAreaWithNegativeValues() {
        assertEquals(-10.0, TriangleArea.calculateTriangleArea(-4, 5));
    }
}