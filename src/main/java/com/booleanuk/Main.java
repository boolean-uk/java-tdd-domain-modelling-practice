package com.booleanuk;

import java.util.Scanner;

public class Main {
    public void menu() {

        System.out.println("Welcome to the menu");
    }


    public void program() {
        Scanner scan = new Scanner(System.in);

        String input = "";
        while(!input.equalsIgnoreCase("q")) {
            menu();
            if(scan.hasNextLine()) {
                input = scan.nextLine();
            }
        }
        scan.close();
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.program();
    }
}
