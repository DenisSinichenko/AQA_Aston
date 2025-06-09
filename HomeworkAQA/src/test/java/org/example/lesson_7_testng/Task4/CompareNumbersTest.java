package org.example.lesson_7_testng.Task4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareNumbersTest {

    @Test
    public void testFirstNumberGreater() {
        Assert.assertEquals(CompareNumbers.compareNumbers(10, 5), "10 > 5", "10 должно быть больше 5");
    }

    @Test
    public void testFirstNumberLess() {
        Assert.assertEquals(CompareNumbers.compareNumbers(3, 7), "3 < 7", "3 должно быть меньше 7");
    }

    @Test
    public void testNumbersAreEqual() {
        Assert.assertEquals(CompareNumbers.compareNumbers(5, 5), "5 = 5", "Числа должны быть равны");
    }
}