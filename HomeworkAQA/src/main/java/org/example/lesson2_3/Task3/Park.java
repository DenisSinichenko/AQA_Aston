package org.example.lesson2_3.Task3;

public class Park {
    private String name;
    private Attraction[] attractions;
    private int count; // Счетчик аттракционов

    public Park(String name) {
        this.name = name;
        this.attractions = new Attraction[10]; // Фиксированный размер массива
        this.count = 0;
    }

    // Вложенный класс Аттракцион
    public static class Attraction {
        private String name;
        private String workHours;
        private double price;

        public Attraction(String name, String workHours, double price) {
            this.name = name;
            this.workHours = workHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkHours() {
            return workHours;
        }

        public double getPrice() {
            return price;
        }
    }

    public void addAttraction(Attraction attraction) {
        if (count < attractions.length) {
            attractions[count] = attraction;
            count++;
        } else {
            System.out.println("Нельзя добавить больше аттракционов!");
        }
    }

    public void printAttractions() {
        System.out.println("Название парка: " + name);
        for (int i = 0; i < count; i++) {
            System.out.println("Аттракцион: " + attractions[i].getName() + ", Время работы: " + attractions[i].getWorkHours() + ", Цена: " + attractions[i].getPrice());
        }
    }
}