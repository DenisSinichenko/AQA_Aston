package org.example.lesson2_3.Task3;

public class Park {
    private String name;
    private Attraction attraction1;
    private Attraction attraction2;
    private Attraction attraction3;

    // Конструктор парка
    public Park(String name) {
        this.name = name;
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

    public void setAttraction1(Attraction attraction) {
        this.attraction1 = attraction;
    }

    public void setAttraction2(Attraction attraction) {
        this.attraction2 = attraction;
    }

    public void setAttraction3(Attraction attraction) {
        this.attraction3 = attraction;
    }

    public Attraction getAttraction1() {
        return attraction1;
    }

    public Attraction getAttraction2() {
        return attraction2;
    }

    public Attraction getAttraction3() {
        return attraction3;
    }

    // Геттер для имени парка
    public String getName() {
        return name;
    }

}