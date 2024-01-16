package com.booleanuk;

import java.util.Scanner;

public class Student {
    Scanner input = new Scanner(System.in);

    public Student(){
        System.out.println("s");
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
