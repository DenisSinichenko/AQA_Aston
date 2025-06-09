package org.example.lesson_7_junit_5.Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial.calculateFactorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, Factorial.calculateFactorial(1));
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(24, Factorial.calculateFactorial(4));
    }

    @Test
    void testNegativeInput() {
        try {
            Factorial.calculateFactorial(-5);
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Число должно быть >= 0", e.getMessage(), "Ошибка при отрицательном числе");
        }
    }
}