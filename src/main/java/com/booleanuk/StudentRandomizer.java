package com.booleanuk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
        return this.students.get(randomizer.nextInt(bound));
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
