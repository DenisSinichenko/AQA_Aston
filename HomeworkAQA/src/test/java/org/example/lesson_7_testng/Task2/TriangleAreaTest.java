package org.example.lesson_7_testng.Task2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriangleAreaTest {

    private TriangleArea triangleArea;

    @BeforeMethod
    public void setVariable() {
        triangleArea = new TriangleArea();
    }

    @Test
    public void testTriangleAreaWithPositiveNumbers() {
        Assert.assertEquals(triangleArea.calculateTriangleArea(4, 5), 10.0, "Ошибка в расчёте площади");
    }

    @Test
    public void testTriangleAreaWithZeroHeight() {
        try {
            triangleArea.calculateTriangleArea(5, 0);
            Assert.fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Основание и высота должны быть > 0");
        }
    }

    @Test
    public void testTriangleAreaWithZeroBase() {
        try {
            triangleArea.calculateTriangleArea(0, 5);
            Assert.fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Основание и высота должны быть > 0");
        }
    }

    @Test
    public void testTriangleAreaWithNegativeValues() {
        try {
            triangleArea.calculateTriangleArea(-4, 5);
            Assert.fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Основание и высота должны быть > 0");
        }
    }
}