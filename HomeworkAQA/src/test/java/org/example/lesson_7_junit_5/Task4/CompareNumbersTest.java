package org.example.lesson_7_junit_5.Task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompareNumbersTest {
    CompareNumbers compare = new CompareNumbers();

    @Test
    void testGreaterThan1() {
        assertEquals("5 > 1", compare.compareNumbers(5, 1));
    }

    @Test
    void testGreaterThan2() {
        assertEquals("5 > -1", compare.compareNumbers(5, -1));
    }

    @Test
    void testNegativeGreaterThan() {
        assertEquals("-1 > -5", compare.compareNumbers(-1, -5));
    }

    @Test
    void testLessThan() {
        assertEquals("1 < 5", compare.compareNumbers(1, 5));
    }

    @Test
    void testEqualNumbers() {
        assertEquals("5 = 5", compare.compareNumbers(5, 5));
    }
}