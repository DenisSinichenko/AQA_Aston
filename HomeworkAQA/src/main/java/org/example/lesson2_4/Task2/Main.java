package org.example.lesson2_4.Task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Красный", "Черный");
        Rectangle rectangle = new Rectangle(4, 6, "Синий", "Зеленый");
        Triangle triangle = new Triangle(3.5, 4.9, 2, "Желтый", "Фиолетовый");

        circle.printInfo();
        System.out.println("-----------------------");
        rectangle.printInfo();
        System.out.println("-----------------------");
        triangle.printInfo();
    }
}