package com.booleanuk;

import java.util.Random;

public class RandomStudentSelector {

    public Random randomiser;
    public String[] listOfNames;

    public RandomStudentSelector(String[] students) {
        this.randomiser = new Random();
        this.listOfNames = students;
    }

    public String getRandomStudent() {
        return this.listOfNames[this.randomiser.nextInt(this.listOfNames.length)];
    }

    /* Main function for testing different seeds. */
    public static void main(String[] args) {
        String[] students = {"Gustav", "Alexandra", "Alex", "Sebastian"};
        RandomStudentSelector studentSelector = new RandomStudentSelector(students);
        for (int i = 0; i < 5; i++) {
            System.out.println(studentSelector.getRandomStudent());
        }
    }
}
