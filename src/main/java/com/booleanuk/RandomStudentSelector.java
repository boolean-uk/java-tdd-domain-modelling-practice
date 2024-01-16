package com.booleanuk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomStudentSelector {

    public Random randomiser;
    public ArrayList<String> listOfNames;

    public RandomStudentSelector(ArrayList<String> students) {
        this.randomiser = new Random(500);
        this.listOfNames = students;
    }

    public String getRandomStudent() {
        return this.listOfNames.get(this.randomiser.nextInt(this.listOfNames.size()));
    }

    public ArrayList<ArrayList<String>> getRandomPairs() {
        int currentSize = this.listOfNames.size();
        ArrayList<ArrayList<String>> pairs = new ArrayList<>();
        int randomNumber;

        while (currentSize != 0) {
            ArrayList<String> newPair = new ArrayList<>();
            for (int i = 0; i < 2; i++) {
                randomNumber = this.randomiser.nextInt(currentSize);
                newPair.add(this.listOfNames.get(randomNumber));
                this.listOfNames.remove(randomNumber);
                currentSize--;
            }
            pairs.add(newPair);
        }
        return pairs;
    }

    /* Main function for testing different seeds. */
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Gustav", "Alexandra", "Alex", "Sebastian", "Paulina"));
        ArrayList<String> firstPair = new ArrayList<>(Arrays.asList("Sebastian", "Alex"));

        RandomStudentSelector studentSelector = new RandomStudentSelector(students);

        System.out.println(studentSelector.getRandomPairs());

        /*for (int i = 0; i < 5; i++) {
            System.out.println(studentSelector.getRandomStudent());
        }*/
    }
}
