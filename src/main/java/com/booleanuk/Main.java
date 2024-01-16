package com.booleanuk;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize studentrandomizer class and get students from file
        // Exit if file not found
        StudentRandomizer studentRandomizer = null;
        try {
            studentRandomizer = new StudentRandomizer("students");
        } catch (FileNotFoundException e) {
            System.out.println("Could not get students from file: " + e.getMessage());
            System.exit(0);
        }

        // Print menu and get input
        // Depending on input get student(s) / exit
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("""
                  __                          _                                   \s
                 (_ _|_      _|  _  ._ _|_   |_)  _. ._   _|  _  ._ _  o _   _  ._\s
                 __) |_ |_| (_| (/_ | | |_   | \\ (_| | | (_| (_) | | | | /_ (/_ | \s
                """);

        do {
            printMenu();
            input = sc.nextLine();

            switch (input) {
                case "a" -> System.out.println(studentRandomizer.getRandomStudent());
                case "b" -> {
                    ArrayList<String[]> randomPairs = studentRandomizer.getRandomPairs();
                    for (int i = 0; i < randomPairs.size(); i++) {
                        System.out.println("Pair " + (i+1) + ": " + Arrays.toString(randomPairs.get(i)));
                    }
                }
                case "c" -> System.out.println("TODO"); // TODO
            }
        } while (!input.equalsIgnoreCase("X"));

        System.out.println("ByeBye :)");
    }

    public static void printMenu() {
        System.out.println("a\tget random student");
        System.out.println("b\tget random pairs");
        System.out.println("c\tget random peer groups");
        System.out.println("x\texit");
        System.out.print("> ");
    }
}
