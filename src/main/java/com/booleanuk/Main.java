package com.booleanuk;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main {


    public Random rand;
    private ArrayList<String> listOfStudents;

    public void menu() {

        System.out.println("Welcome to the menu \n Here are the different functions: \n  1. Choose random student \n 2. Output list of randomly chosen pairs \n 3. Output random list of peer groups \n 4. Current students");

    }


    public Main() {
        makeListFromFile();
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
/*        main.program();*/

       main.makeListFromFile();
    }


    public String getRandomStudent() {

        return "";
    }

    public void makeListFromFile() {
        ArrayList<String> listOfStudentsReturn = null;
        try {
            FileInputStream fstream = new FileInputStream("src/main/java/com/booleanuk/StudentList.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;


            listOfStudentsReturn = new ArrayList<>();
            // Read File Line By Line
            while ((strLine = br.readLine()) != null) {

                listOfStudentsReturn.add(strLine);
            }


        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }



        this.listOfStudents = listOfStudentsReturn;
    }

    public ArrayList<String> getListOfStudents() {
        if(this.listOfStudents == null) {
            makeListFromFile();
        }
        return this.listOfStudents;
    }
}
