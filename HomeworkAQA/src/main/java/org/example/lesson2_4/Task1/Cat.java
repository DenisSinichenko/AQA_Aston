package org.example.lesson2_4.Task1;

public class Cat extends Animal {
    private boolean isFull = false;

    public Cat(String name) {
        super(name, 200, 0);
    }

    public void eat(Bowl bowl) {
        if (bowl.decreaseFood(5)) {
            isFull = true;
            System.out.println(name + " поел и теперь сыт");
        } else {
            System.out.println(name + " не смог поесть, недостаточно еды");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public String getName() {
        return name;
    }
}