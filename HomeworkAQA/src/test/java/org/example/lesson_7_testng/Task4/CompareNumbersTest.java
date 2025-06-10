package org.example.lesson_7_testng.Task4;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompareNumbersTest {

    private CompareNumbers compare;

    @BeforeMethod
    public void setVariable() {
        compare = new CompareNumbers();
    }

    @Test
    public void testFirstNumberGreater() {
        Assert.assertEquals(compare.compareNumbers(10, 5), "10 > 5", "10 должно быть больше 5");
    }

    @Test
    public void testFirstNumberLess() {
        Assert.assertEquals(compare.compareNumbers(3, 7), "3 < 7", "3 должно быть меньше 7");
    }

    @Test
    public void testFirstNumberGreater2() {
        Assert.assertEquals(compare.compareNumbers(5, -1), "5 > -1", "5 должно быть больше -1");
    }

    @Test
    public void testNegativeGreaterThan() {
        Assert.assertEquals(compare.compareNumbers(-1, -5), "-1 > -5", "-1 должно быть больше -5");
    }

    @Test
    public void testNumbersAreEqual() {
        Assert.assertEquals(compare.compareNumbers(5, 5), "5 = 5", "Числа должны быть равны");
    }
}