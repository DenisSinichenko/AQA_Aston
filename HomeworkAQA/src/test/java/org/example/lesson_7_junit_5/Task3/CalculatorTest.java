package org.example.lesson_7_junit_5.Task3;

import org.example.lesson_7_junit_5.Task1.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sumNumbers() {
        assertEquals(10, Calculator.sumNumbers(5,5));
    }

    @Test
    void difNumbers() {
        assertEquals(0, Calculator.difNumbers(5,5));
    }

    @Test
    void divNumbers() {
        assertEquals(1, Calculator.divNumbers(5,5));
    }

    @Test
    void mulNumbers() {
        assertEquals(25, Calculator.mulNumbers(5,5));
    }

    @Test
    void testSumWithNegativeNumbers1() {
        assertEquals(-2, Calculator.sumNumbers(-5, 3));
    }

    @Test
    void testSumWithNegativeNumbers2() {
        assertEquals(-8, Calculator.sumNumbers(-5, -3));
    }

    @Test
    void testDivNegativeNumbers() {
        assertEquals(-2, Calculator.divNumbers(-10, 5));
    }

    @Test
    void testMulNegativeNumbers() {
        assertEquals(-25, Calculator.mulNumbers(-5, 5));
    }

    @Test
    void divNumbersByZero() {
        try {
            Calculator.divNumbers(5, 0);
            fail("Ожидалось исключение ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("На ноль делить нельзя!", e.getMessage(), "Ошибка при делении на 0");
        }
    }
}