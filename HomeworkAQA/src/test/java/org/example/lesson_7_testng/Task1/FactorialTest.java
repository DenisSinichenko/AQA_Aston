package org.example.lesson_7_testng.Task1;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FactorialTest {

    private Factorial factorial;

    @BeforeMethod
    public void setVariable() {
        factorial = new Factorial();
    }

    @Test
    public void testFactorialOfZero() {
        long result = factorial.calculateFactorial(0);
        Assert.assertEquals(result, 1, "Факториал 0 должен быть 1");
    }
    @Test
    public void testFactorialOfOne() {
        long result = factorial.calculateFactorial(1);
        Assert.assertEquals(result, 1, "Факториал 1 должен быть 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        long result = factorial.calculateFactorial(4);
        Assert.assertEquals(result, 24, "Факториал 4 должен быть 24");
    }

    @Test
    public void testNegativeNumber() {
        try {
            factorial.calculateFactorial(-1);
            Assert.fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Число должно быть >= 0");
        }
    }
}