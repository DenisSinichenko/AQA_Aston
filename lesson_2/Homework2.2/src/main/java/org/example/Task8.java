package org.example;

public class Task8 {
    public void printStringCount(String s, int n){
        if(n == 0){
            System.out.println("Вы ввели число 0, печатать не буду!");
        }else {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        }
    }
}
