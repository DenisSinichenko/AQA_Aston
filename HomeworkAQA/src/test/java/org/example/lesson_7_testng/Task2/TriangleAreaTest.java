package org.example.lesson_7_testng.Task2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaTest {

    @Test
    public void testTriangleAreaWithValidValues() {
        double result = TriangleArea.calculateTriangleArea(10, 2);
        Assert.assertEquals(result, 10.0, "Площадь треугольника должна быть 10.0");
    }

    @Test
    public void testTriangleAreaWithInvalidValues() {
        try {
            TriangleArea.calculateTriangleArea(0, 5);
            Assert.fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Стороны треугольника должны быть > 0");
        }
    }

    @Test
    public void testTriangleAreaWithNegativeValues() {
        try {
            TriangleArea.calculateTriangleArea(-10, 2);
            Assert.fail("Должно быть выброшено исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Стороны треугольника должны быть > 0");
        }
    }
}