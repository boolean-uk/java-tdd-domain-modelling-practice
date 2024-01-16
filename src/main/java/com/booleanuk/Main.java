package com.booleanuk;

import java.util.Random;
import java.util.Scanner;

public class Main {
    Random randomizer;
    public String[] lisOfNames = {"Dave", "Hassan", "Osamah", "Thomas", "Noah", "Enock"};
    public String[] functions = {"Pairs", "Peer groups", "Random Student"};
    public Main(){
        randomizer = new Random(100);
    }
    public String getFunctions(){
        return this.functions[this.randomizer.nextInt(this.functions.length)];
    }
    public String getRandomStudents(){
        return this.lisOfNames[this.randomizer.nextInt(this.lisOfNames.length)];
    }

    public String returnPairs(){
        int teller = 0;
        String out = "";
        while(teller < 2){
            out += this.lisOfNames[this.randomizer.nextInt(this.lisOfNames.length)];
            teller++;
        }
        return out;
    }


    public static void main(String[] args) {
        Main main = new Main();
        // Java Scanner String input example
        //System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //System.out.println(name + " is a nice name!");
        main.getFunctions();
    }
}
