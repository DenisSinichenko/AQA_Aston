package org.example.lesson2_6.Task1;

import java.util.ArrayList;

public class Student {
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> marksSubjects;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marksSubjects = new ArrayList<>();
    }

    public void addMark(int marksSubject) {
        marksSubjects.add(marksSubject);
    }

    public double getAverageMark() {
        int sum = 0;
        for (int mark : marksSubjects) {
            sum = sum + mark;
        }
        return (double) sum / marksSubjects.size();
    }

    public void transferToNextCourse() {
        if (getAverageMark() >= 3) {
            course++;
            System.out.println(name + " переведён на следующий курс");
        }
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public ArrayList<Integer> getMarks() {
        return marksSubjects;
    }
}