package org.example.lesson2_6.Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student("Бил Гейтс", "М-21", 2), new Student("Стив Джобс", "П-11", 1), new Student("Илон Маск", "Э-31", 3)));

        students.get(0).addMark(8);
        students.get(0).addMark(7);
        students.get(0).addMark(9);

        students.get(1).addMark(5);
        students.get(1).addMark(4);
        students.get(1).addMark(3);

        students.get(2).addMark(2);
        students.get(2).addMark(2);
        students.get(2).addMark(2);

        for (Student student : students) {
            System.out.println(student.getName() + ", группа: " + student.getGroup() + ", отметки: " + student.getMarks());
        }

        System.out.println("\nРезультаты сессии:");
        removingStudents(students);

        transferStudents(students);
    }

    public static void removingStudents(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageMark() < 3) {
                System.out.println(students.get(i).getName() + " удалён из списка, средний балл < 3");
                students.remove(i);
                i--;
            }
        }
    }

    public static void transferStudents(ArrayList<Student> students) {
        for (Student student : students) {
            student.transferToNextCourse();
        }
    }
}