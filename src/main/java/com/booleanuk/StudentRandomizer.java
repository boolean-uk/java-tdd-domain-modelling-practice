package com.booleanuk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRandomizer {
    private final static String EXT = ".csv";

    private final ArrayList<String> students;
    private final String fileName;

    public StudentRandomizer(String fileName) {
        this.students = new ArrayList<>();
        this.fileName = fileName;
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
