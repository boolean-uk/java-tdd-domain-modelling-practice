package com.booleanuk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandomStudents {

    public ArrayList<String> studentList;

    public RandomStudents(){
        studentList = loadList();
    }
    public ArrayList<String> loadList(){
        ArrayList<String> arr = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\main\\java\\com\\booleanuk\\students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                arr.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arr;
    }
    public String displayString(){
        return """
                Choose an option:
                1. Select a random student.
                2. Selected Random Pairs from Student List.
                3. Select Random Groups from Student List
                4. Exit program""";
    }


    public void main(String[] args){



    }
}
