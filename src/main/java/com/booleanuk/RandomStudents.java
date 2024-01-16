package com.booleanuk;

import java.util.ArrayList;
import java.util.Random;

public class RandomStudents {

    ArrayList<String> studentList;

    public RandomStudents(){

    }
    public ArrayList<String> loadList(){
        studentList = new ArrayList<String>();
        studentList.add("Stefan");
        return studentList;
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
