package com.booleanuk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomStudentSelector {

    public Random randomiser;
    public ArrayList<String> listOfNames;

    public RandomStudentSelector() {
        this.randomiser = new Random(500);
        this.listOfNames = new ArrayList<>();
    }

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

    public void loadTextFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String student = scanner.nextLine();
                this.listOfNames.add(student);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /* Main function for testing different seeds. */
    public static void main(String[] args) {
        //ArrayList<String> students = new ArrayList<>(Arrays.asList("Gustav", "Alexandra", "Alex", "Sebastian", "Paulina",
          //      "Hanna", "Elias", "Zuzanna", "Matilda", "Oskar"));

        RandomStudentSelector studentSelector = new RandomStudentSelector();

//        ArrayList<ArrayList<String>> groups = studentSelector.getRandomFourGroups();
//
//        System.out.println(groups.size());
//
//        System.out.println(groups);
        String filePath = "resources/students.txt";

        studentSelector.loadTextFile(filePath);

        System.out.println(studentSelector.listOfNames);

        /*for (int i = 0; i < 5; i++) {
            System.out.println(studentSelector.getRandomStudent());
        }*/
    }
}
