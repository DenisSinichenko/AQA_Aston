package org.example.lesson2_4.Task1;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount = foodAmount - amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        foodAmount = foodAmount + amount;
        System.out.println("Добавлено " + amount + " еды в миску.");
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}