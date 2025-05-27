package org.example.lesson2_4.Task1;

import org.example.lesson2_4.Task1.Bowl;
import org.example.lesson2_4.Task1.Cat;
import org.example.lesson2_4.Task1.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");

        Bowl bowl = new Bowl(15);

        String[] catNames = {"Барсик", "Мурзик", "Васька"};
        Cat[] cats = new Cat[catNames.length];

        for (int i = 0; i < catNames.length; i++) {
            cats[i] = new Cat(catNames[i]);
        }

        System.out.println("Всего животных: " + Dog.getAnimalCount());

        dog.run(300);
        dog.swim(5);

        for (Cat cat : cats) {
            cat.run(150);
            cat.swim(10);
        }

        System.out.println("Еды в миске: " + bowl.getFoodAmount());

        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println(cat.getName() + " сыт? " + cat.isFull());
        }

        System.out.println("Остаток еды в миске: " + bowl.getFoodAmount());

        bowl.addFood(10);
        System.out.println("Пополнение миски. Еды теперь: " + bowl.getFoodAmount());

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl);
                System.out.println(cat.getName() + " сыт? " + cat.isFull());
            }
        }
    }
}