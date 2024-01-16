package com.booleanuk;

import java.util.Random;
import java.util.Scanner;

public class Student {
    public String[] students = {"Tonnes", "Sander", "Enock", "Jenny", "Julie", "Tor", "Fred"};
    Scanner input = new Scanner(System.in);
    public Random randomiser;

    public Student(){
        this.randomiser = new Random();
    }

    public String randomStudent() {
        return students[randomiser.nextInt(students.length)];
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
