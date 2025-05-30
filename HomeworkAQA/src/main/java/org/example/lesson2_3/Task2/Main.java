package org.example.lesson2_3.Task2;

import org.example.lesson2_3.Task1.Product;

public class Main {
    public static void main(String[] args) {

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25", "01.02.2025", "Samsung", "Корея", 5599.5, true);
        productsArray[1] = new Product("iPhone 15 Pro", "15.03.2025", "Apple", "США", 7999.35, false);
        productsArray[2] = new Product("Sony PlayStation 6", "12.05.2025", "Sony", "Япония", 49.99, true);
        productsArray[3] = new Product("Acer Aspire", "20.04.2025", "Acer", "США", 9999.52, false);
        productsArray[4] = new Product("Xiaomi Mi 7", "02.06.2025", "Xiaomi", "Китай", 291.99, true);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
            System.out.println("------------------");
        }
    }
}
