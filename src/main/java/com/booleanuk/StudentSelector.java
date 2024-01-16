package com.booleanuk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class StudentSelector {
    List<String> students;
    Random randomiser;

    StudentSelector(String studentFile){
        randomiser = new Random();
        loadStudentFile(studentFile);
    }

    public void loadStudentFile(String studentFile){
        try {
            Scanner sc = new Scanner(new File(studentFile));
            String file = sc.next();
            students = Arrays.asList(file.split(", "));

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
