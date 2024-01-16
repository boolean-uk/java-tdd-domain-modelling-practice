package com.booleanuk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentRandomizer {
    private final static String EXT = ".csv";

    private final ArrayList<String> students;
    private final String fileName;
    private final Random randomizer;
    private final int bound;

    public StudentRandomizer(String fileName) throws FileNotFoundException {
        this.students = new ArrayList<>();
        this.fileName = fileName;
        this.randomizer = new Random();
        fetchStudentsFromFile();
        this.bound = students.size();
    }
    public StudentRandomizer(String fileName, int randomizerSeed) throws FileNotFoundException {
        this.students = new ArrayList<>();
        this.fileName = fileName;
        this.randomizer = new Random(randomizerSeed);
        fetchStudentsFromFile();
        this.bound = students.size();
    }

    public String getRandomStudent() {
        return this.students.get(randomizer.nextInt(0, bound));
    }

    public ArrayList<String[]> getRandomPairs() {
        int pairCount = students.size() / 2;
        ArrayList<String[]> studentPairs = new ArrayList<>();
        int[] randomOrder = randomizer.ints(0, bound).distinct().limit(bound).toArray();
        // DEBUG
        // System.out.println(students);
        // System.out.println("bound=" + bound);
        // System.out.println("paircount=" + pairCount);
        // System.out.println(Arrays.toString(randomOrder));

        // Create pairs
        for (int i = 0; i < pairCount; i++) {
            int index = i * 2;
            String student1 = students.get(randomOrder[index]);
            String student2 = students.get(randomOrder[index + 1]);
            studentPairs.add(new String[]{student1, student2});
        }

        // Odd number of students -> add "pair of one"
        if (students.size() % 2 != 0) {
            studentPairs.add(new String[]{students.get(randomOrder[randomOrder.length-1])});
        }

        return studentPairs;
    }

    public void fetchStudentsFromFile() throws FileNotFoundException {
        String file = fileName + EXT;
        Scanner scanner = new Scanner(new File(file));

        scanner.nextLine(); // Skip .csv header
        while (scanner.hasNext()) {
            students.add(scanner.nextLine());
        }
    }

    public ArrayList<String> getStudents() {
        return students;
    }
}
