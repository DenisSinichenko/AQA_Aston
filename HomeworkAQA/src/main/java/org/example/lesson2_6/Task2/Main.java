package org.example.lesson2_6.Task2;

public class Main {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.add("Трамп", "80291111111");
        telephoneBook.add("Маск", "80292222222");
        telephoneBook.add("Трамп", "80293333333");
        telephoneBook.add("Трамп", "80294444444");
        telephoneBook.add("Иванов", "80295555555");

        System.out.println("-------------------------------");
        telephoneBook.printPhoneBook();

        System.out.println("--------------------------------");
        telephoneBook.get("Маск");
        telephoneBook.get("Трамп");
        telephoneBook.get("Синиченко");
    }
}