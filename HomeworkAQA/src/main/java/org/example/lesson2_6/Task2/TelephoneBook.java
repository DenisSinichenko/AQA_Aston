package org.example.lesson2_6.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneBook {
    private Map<String, List<String>> phoneBook;

    public TelephoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            phoneBook.get(lastName).add(phoneNumber);
        } else {
            List<String> phoneList = new ArrayList<>();
            phoneList.add(phoneNumber);
            phoneBook.put(lastName, phoneList);
        }
    }

    public void get(String lastName) {
        if (phoneBook.containsKey(lastName)) {
            System.out.println("Сведения о фамилии " + lastName + ":");
            for (String phone : phoneBook.get(lastName)) {
                System.out.println(lastName + ": " + phone);
            }
        } else {
            System.out.println("Фамилии " + lastName + " в справочнике нет!");
        }
    }

    public void printPhoneBook() {
        System.out.println("Весь список справочника:");
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            for (String phone : entry.getValue()) {
                System.out.println(entry.getKey() + ": " + phone);
            }
        }
    }
}