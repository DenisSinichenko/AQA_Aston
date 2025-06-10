package org.example.lesson_7_junit_5.Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testSumNumbers() {
        assertEquals(10, calculator.sumNumbers(5,5));
    }

    @Test
    void testDifNumbers() {
        assertEquals(0, calculator.difNumbers(5,5));
    }

    @Test
    void testDivNumbers() {
        assertEquals(1, calculator.divNumbers(5,5));
    }

    @Test
    void testMulNumbers() {
        assertEquals(25, calculator.mulNumbers(5,5));
    }

    @Test
    void testSumWithNegativeNumbers1() {
        assertEquals(-2, calculator.sumNumbers(-5, 3));
    }

    @Test
    void testSumWithNegativeNumbers2() {
        assertEquals(-8, calculator.sumNumbers(-5, -3));
    }

    @Test
    void testDivNegativeNumbers() {
        assertEquals(-2, calculator.divNumbers(-10, 5));
    }

    @Test
    void testMulNegativeNumbers() {
        assertEquals(-25, calculator.mulNumbers(-5, 5));
    }

    @Test
    void testDivNumbersByZero() {
        try {
            calculator.divNumbers(5, 0);
            fail("Ожидалось исключение ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("На ноль делить нельзя!", e.getMessage(), "Ошибка при делении на 0");
        }
    }
}