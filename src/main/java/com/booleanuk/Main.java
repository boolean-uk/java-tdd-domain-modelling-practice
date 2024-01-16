package com.booleanuk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        do {
            printMenu();
            input = sc.nextLine();
        } while (!input.equalsIgnoreCase("X"));

        System.out.println("ByeBye :)");
    }

    public static void printMenu() {
        System.out.println("""
                  __                          _                                   \s
                 (_ _|_      _|  _  ._ _|_   |_)  _. ._   _|  _  ._ _  o _   _  ._\s
                 __) |_ |_| (_| (/_ | | |_   | \\ (_| | | (_| (_) | | | | /_ (/_ | \s
                """);
        System.out.println("a\tget random student");
        System.out.println("b\tget random pairs");
        System.out.println("c\tget random peer groups");
        System.out.println("x\texit\n");
        System.out.print("> ");
    }
}
