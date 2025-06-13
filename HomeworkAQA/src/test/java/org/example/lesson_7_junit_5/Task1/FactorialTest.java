package org.example.lesson_7_junit_5.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    void testFactorialOfZero() {
        assertEquals(1, factorial.calculateFactorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, factorial.calculateFactorial(1));
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(24, factorial.calculateFactorial(4));
    }

    @Test
    void testNegativeInputNumber() {
        try {
            factorial.calculateFactorial(-5);
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Число должно быть >= 0", e.getMessage(), "Ошибка при отрицательном числе");
        }
    }
}