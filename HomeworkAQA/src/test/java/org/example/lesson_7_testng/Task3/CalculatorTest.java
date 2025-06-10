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
    public void testSumWithNegativeNumbers1() {
        Assert.assertEquals(Calculator.sumNumbers(-5, 3), -2, "-5 + 3 должно быть -2");
    }

    @Test
    public void testSumWithNegativeNumbers2() {
        Assert.assertEquals(Calculator.sumNumbers(-5, -3), -8, "-5 + (-3) должно быть -8");
    }

    @Test
    public void testDivNegativeNumbers() {
        Assert.assertEquals(Calculator.divNumbers(-10, 5), -2, "-10 / 5 должно быть -2");
    }

    @Test
    public void testMulNegativeNumbers() {
        Assert.assertEquals(Calculator.mulNumbers(-5, 5), -25, "-5 * 5 должно быть -25");
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