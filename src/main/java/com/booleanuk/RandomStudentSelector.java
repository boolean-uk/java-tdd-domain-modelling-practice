package com.booleanuk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomStudentSelector {

    public Random randomiser;
    public ArrayList<String> listOfNames;

    public RandomStudentSelector(ArrayList<String> students) {
        this.randomiser = new Random();
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
                if (currentSize == 0) {
                    break;
                }
                randomNumber = this.randomiser.nextInt(currentSize);
                newPair.add(this.listOfNames.get(randomNumber));
                this.listOfNames.remove(randomNumber);
                currentSize--;
            }
            pairs.add(newPair);
        }
        return pairs;
    }

    public ArrayList<ArrayList<String>> getRandomFourGroups() {
        int currentSize = this.listOfNames.size();
        ArrayList<ArrayList<String>> groups = new ArrayList<>();
        int randomNumber;

        while (currentSize != 0) {
            ArrayList<String> newGroup = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                if (currentSize == 0) {
                    break;
                }
                randomNumber = this.randomiser.nextInt(currentSize);
                newGroup.add(this.listOfNames.get(randomNumber));
                this.listOfNames.remove(randomNumber);
                currentSize--;
            }
            groups.add(newGroup);
        }
        return groups;
    }

    /* Main function for testing different seeds. */
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Gustav", "Alexandra", "Alex", "Sebastian", "Paulina", "Hanna", "Elias", "Zuzanna"));
        ArrayList<String> firstGroup = new ArrayList<>(Arrays.asList("Sebastian", "Hanna", "Gustav", "Zuzanna"));

        RandomStudentSelector studentSelector = new RandomStudentSelector(students);

        ArrayList<ArrayList<String>> groups = studentSelector.getRandomFourGroups();

        System.out.println(groups.size());

        System.out.println(groups);

        /*for (int i = 0; i < 5; i++) {
            System.out.println(studentSelector.getRandomStudent());
        }*/
    }
}
