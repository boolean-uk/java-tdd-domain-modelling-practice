package com.booleanuk;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Student {
    public String[] students = {"Tonnes", "Sander", "Enock", "Jenny", "Julie", "Tor", "Fred"};
    Scanner input = new Scanner(System.in);
    public Random randomiser;
    boolean[] studentPaired;

    public Student(){
        this.randomiser = new Random();

        // Initiates tracker for which student is paired
        studentPaired = new boolean[students.length];
        Arrays.fill(studentPaired, false);
    }

    public String randomStudent() {
        return students[randomiser.nextInt(students.length)];
    }

    public String[][] randomStudentPairs() {
        int numPairs = (students.length / 2) + (students.length % 2) ;
        String[][] studentPairs = new String[numPairs][2];
        int randomInt = 0;
        int numPaired = 0;

        // Iteratores in the two-dimentional array
        int i = 0;
        int j = 0;

        while (numPaired < students.length) {
            while (true) {
                randomInt = randomiser.nextInt(students.length);
                // Check if student has already been paired
                if (!this.studentPaired[randomInt]) {
                    this.studentPaired[randomInt] = true;
                    break;
                }
            }
            studentPairs[i][j] = students[randomInt];
            numPaired++;

            // update iterators
            j++;
            if (j > 1) { // Pair full, next pairs
                j = 0;
                i++;
            }
        }
        Arrays.fill(studentPaired, false);
        return studentPairs;
    }


    public String userMenu() {
        String userInput = "";

        // Display menu to User
        System.out.println("Student Class Menu");
        System.out.println("R: Random Student");

        // Take user input
        userInput = input.nextLine().toUpperCase();

        if ( !userInput.equals("B") ){
            userInput ="";
        }
        return userInput;

    }


}
