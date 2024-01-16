package com.booleanuk;

import java.util.Random;

public class RandomStudentSelector {
    public Random randomiser;
    public String[] students = {"Marit", "Nora", "Alexander", "Ole", "Stian", "Tollov"};

    public RandomStudentSelector() {
        this.randomiser = new Random();
    }

    public void showMenu() {
        String menu = "This is a random student selector.\n" +
                "S: Get random student.\n" +
                "P: Get random pairs.\n" +
                "G: Get random pair groups.\n" +
                "X: Exit program.";
        System.out.println(menu);
    }

    public String getRandomStudent() {
        return this.students[this.randomiser.nextInt(this.students.length)];
    }
}
