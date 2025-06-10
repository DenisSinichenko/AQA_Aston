package org.example.lesson_7_testng.Task3;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeMethod
    public void setVariable() {
        calculator = new Calculator();
    }

    @Test
    public void testSumNumbers() {
        Assert.assertEquals(calculator.sumNumbers(5, 5), 10, "5 + 5 должно быть 10");
    }

    @Test
    public void testDifNumbers() {
        Assert.assertEquals(calculator.difNumbers(5, 5), 0, "5 - 5 должно быть 0");
    }

    @Test
    public void testMulNumbers() {
        Assert.assertEquals(calculator.mulNumbers(5, 5), 25, "5 * 5 должно быть 25");
    }

    @Test
    public void testDivNumbersValid() {
        Assert.assertEquals(calculator.divNumbers(5, 5), 1, "5 / 5 должно быть 1");
    }

    @Test
    public void testSumWithNegativeNumbers1() {
        Assert.assertEquals(calculator.sumNumbers(-5, 3), -2, "-5 + 3 должно быть -2");
    }

    @Test
    public void testSumWithNegativeNumbers2() {
        Assert.assertEquals(calculator.sumNumbers(-5, -3), -8, "-5 + (-3) должно быть -8");
    }

    @Test
    public void testDivNegativeNumbers() {
        Assert.assertEquals(calculator.divNumbers(-10, 5), -2, "-10 / 5 должно быть -2");
    }

    @Test
    public void testMulNegativeNumbers() {
        Assert.assertEquals(calculator.mulNumbers(-5, 5), -25, "-5 * 5 должно быть -25");
    }

    @Test
    public void testDivNumbersThrowsException() {
        try {
            calculator.divNumbers(5, 0);
            Assert.fail("Ожидалось исключение ArithmeticException");
        } catch (ArithmeticException e) {
            Assert.assertEquals(e.getMessage(), "На ноль делить нельзя!");
        }
    }
}