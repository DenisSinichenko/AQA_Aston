package org.example.lesson_7_testng.Task3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testSumNumbers() {
        Assert.assertEquals(Calculator.sumNumbers(5, 5), 10, "5 + 5 должно быть 10");
    }

    @Test
    public void testDifNumbers() {
        Assert.assertEquals(Calculator.difNumbers(5, 5), 0, "5 - 5 должно быть 0");
    }

    @Test
    public void testMulNumbers() {
        Assert.assertEquals(Calculator.mulNumbers(5, 5), 25, "5 * 5 должно быть 25");
    }

    @Test
    public void testDivNumbersValid() {
        Assert.assertEquals(Calculator.divNumbers(5, 5), 1, "5 / 5 должно быть 1");
    }

    @Test
    public void testDivNumbersThrowsException() {
        try {
            Calculator.divNumbers(5, 0);
            Assert.fail("Ожидалось исключение ArithmeticException");
        } catch (ArithmeticException e) {
            Assert.assertEquals(e.getMessage(), "На ноль делить нельзя!");
        }
    }
}