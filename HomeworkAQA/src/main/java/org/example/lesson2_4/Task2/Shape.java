package org.example.lesson2_4.Task2;

public abstract class Shape {
    protected String fillColor;
    protected String borderColor;

    public Shape(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public abstract void printInfo();
}