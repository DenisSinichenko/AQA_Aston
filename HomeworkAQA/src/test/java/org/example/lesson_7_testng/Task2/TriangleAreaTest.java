package org.example.lesson_7_testng.Task2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaTest {

    @Test
    public void testTriangleAreaWithPositiveNumbers() {
        Assert.assertEquals(TriangleArea.calculateTriangleArea(4, 5), 10.0, "Ошибка в расчёте площади");
    }

    @Test
    public void testTriangleAreaWithZeroHeightThrowsException() {
        try {
            TriangleArea.calculateTriangleArea(5, 0);
            Assert.fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Основание и высота должны быть > 0");
        }
    }

    @Test
    public void testTriangleAreaWithZeroBaseThrowsException() {
        try {
            TriangleArea.calculateTriangleArea(0, 5);
            Assert.fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Основание и высота должны быть > 0");
        }
    }

    @Test
    public void testTriangleAreaWithNegativeValuesThrowsException() {
        try {
            TriangleArea.calculateTriangleArea(-4, 5);
            Assert.fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Основание и высота должны быть > 0");
        }
    }
}