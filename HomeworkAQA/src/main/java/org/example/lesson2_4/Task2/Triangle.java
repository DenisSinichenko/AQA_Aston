package org.example.lesson2_4.Task2;

public class Triangle extends Shape implements FigureArea {
    private double a, b, c;

    public Triangle(double a, double b, double c, String fillColor, String fillBorder) {
        super(fillColor, fillBorder);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    @Override
    public void printInfo() {
        System.out.println("Фигура: Треугольник");
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
    }
}