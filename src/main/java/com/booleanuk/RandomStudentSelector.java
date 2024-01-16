package com.booleanuk;

public class RandomStudentSelector {

    public RandomStudentSelector() {

    }

    public void showMenu() {
        String menu = "This is a random student selector.\n" +
                "S: Get random student.\n" +
                "P: Get random pairs.\n" +
                "G: Get random pair groups.\n" +
                "X: Exit program.";
        System.out.println(menu);
    }
}
