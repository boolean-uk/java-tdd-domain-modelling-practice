package com.booleanuk;

import java.util.ArrayList;
import java.util.Random;

public class RandomStudentSelector {

    public Random randomiser = new Random();
    public String[] students = {"A", "B", "C", "D", "E"};
    public String showMenu() {
        return "Welcome! /n/nPlease select an option./n/nA. Get a random student./nB. " +
                "Get randomised pairs./nC. Get randomised groups of four.";
    }

    public String getRandomStudent() {
        return students[randomiser.nextInt(students.length)];
    }
}
