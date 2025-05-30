package org.example.lesson2_3.Task3;

public class Main {
    public static void main(String[] args) {

        Park park = new Park("Парк им. Луначарского");

        Park.Attraction ferrisWheel = new Park.Attraction("Колесо обозрения", "10:00 - 22:00", 5.5);
        Park.Attraction funSlides = new Park.Attraction("Веселые горки", "11:00 - 20:00", 7);
        Park.Attraction panicRoom = new Park.Attraction("Комната страха", "12:00 - 21:00", 6);

        park.addAttraction(ferrisWheel);
        park.addAttraction(funSlides);
        park.addAttraction(panicRoom);

        park.printAttractions();
    }
}