package org.example.lesson2_3.Task1;

public class Product {
    private String name;
    private String manufactureDate;
    private String manufacturer;
    private String originCountry;
    private double price;
    private boolean isReserved;

    public Product(String name, String manufactureDate, String manufacturer, String originCountry, double price, boolean isReserved) {
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.price = price;
        this.isReserved = isReserved;
    }

    public String getName() {
        return name;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + manufactureDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + originCountry);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Забронирован: " + (isReserved ? "Да" : "Нет"));
    }
}