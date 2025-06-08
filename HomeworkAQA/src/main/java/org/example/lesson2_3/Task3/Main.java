package org.example.lesson2_3.Task3;

public class Main {
    public static void main(String[] args) {

        Park park = new Park("Парк им. Луначарского");

        Park.Attraction ferrisWheel = new Park.Attraction("Колесо обозрения", "10:00 - 22:00", 5.5);
        Park.Attraction funSlides = new Park.Attraction("Веселые горки", "11:00 - 20:00", 7);
        Park.Attraction panicRoom = new Park.Attraction("Комната страха", "12:00 - 21:00", 6);

        park.setAttraction1(ferrisWheel);
        park.setAttraction2(funSlides);
        park.setAttraction3(panicRoom);

        System.out.println("Название парка: " + park.getName());
        System.out.println("Аттракцион 1: " + park.getAttraction1().getName() + ", Время работы: " + park.getAttraction1().getWorkHours() + ", Цена: " + park.getAttraction1().getPrice());
        System.out.println("Аттракцион 2: " + park.getAttraction2().getName() + ", Время работы: " + park.getAttraction2().getWorkHours() + ", Цена: " + park.getAttraction2().getPrice());
        System.out.println("Аттракцион 3: " + park.getAttraction3().getName() + ", Время работы: " + park.getAttraction3().getWorkHours() + ", Цена: " + park.getAttraction3().getPrice());
    }
}