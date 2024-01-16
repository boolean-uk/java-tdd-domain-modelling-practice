package com.booleanuk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomStudents {

    public ArrayList<String> studentList;
    public Random random;

    public RandomStudents(){
        studentList = loadList();
        random = new Random();
    }

    public void setSeed(int seed){
        random = new Random(seed);
    }

    public String getRandomStudent(){
        return studentList.get(random.nextInt(0, studentList.size()));
    }

    public ArrayList<String[]> getRandomPairs(){
        Collections.shuffle(studentList, random);
        ArrayList<String[]> pairs = new ArrayList<>();

        for(int i = 0; i < studentList.size(); i += 2){
            String[] pair = new String[2];
            pair[0] = studentList.get(i);
            if(i + 1 < studentList.size()){
                pair[1] = studentList.get(i + 1);
            }
            else{
                pair[1] = "";
            }
            pairs.add(pair);
        }
        return pairs;
    }

    public ArrayList<String[]> getRandomGroups(){
        Collections.shuffle(studentList, random);
        ArrayList<String[]> groups = new ArrayList<>();
        for(int i = 0; i < 4* (studentList.size() / 4); i += 4){
            String[] group = new String[4];
            group[0] = studentList.get(i);
            group[1] = studentList.get(i + 1);
            group[2] = studentList.get(i + 2);
            group[3] = studentList.get(i + 3);
            groups.add(group);
        }

        return groups;

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


    public static void main(String[] args){

        RandomStudents rs = new RandomStudents();
        rs.setSeed(300);
        for(String[] s: rs.getRandomGroups()){
            System.out.println(Arrays.toString(s));
        }

    }
}