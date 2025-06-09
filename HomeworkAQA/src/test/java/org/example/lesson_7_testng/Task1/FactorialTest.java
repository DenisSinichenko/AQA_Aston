package org.example.lesson_7_testng.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        long result = Factorial.calculateFactorial(0);
        Assert.assertEquals(result, 1, "Факториал 0 должен быть 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        long result = Factorial.calculateFactorial(4);
        Assert.assertEquals(result, 24, "Факториал 4 должен быть 24");
    }

    @Test
    public void testNegativeNumber() {
        try {
            Factorial.calculateFactorial(-1);
            Assert.fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Число должно быть >= 0");
        }
    }
}