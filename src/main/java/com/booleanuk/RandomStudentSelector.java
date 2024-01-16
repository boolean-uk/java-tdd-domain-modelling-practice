package com.booleanuk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class RandomStudentSelector {

    public Random randomiser = new Random();
    public ArrayList<String> students = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
    public String showMenu() {
        return "Welcome! /n/nPlease select an option./n/nA. Get a random student./nB. " +
                "Get randomised pairs./nC. Get randomised groups of four.";
    }

    public String getRandomStudent() {
        return students.get(randomiser.nextInt(students.size()));
    }

    public ArrayList<String> getRandomPairs() {
        ArrayList<String> res = new ArrayList<>();
        Collections.shuffle(students, randomiser);
        String pair;

        for(int i = 0; i < students.size(); i+=2) {
            pair = "";
            pair += students.get(i);
            if(i + 1 < students.size()) {
                pair += " & " + students.get(i+1);
            }
            res.add(pair);
        }

        return res;
    }

    public ArrayList<String> getRandomGroups() {
        ArrayList<String> res = new ArrayList<>();
        Collections.shuffle(students, randomiser);
        String group;

        for(int i = 0; i < students.size(); i+=4) {
            group = "";
            group += students.get(i);
            for(int j = 1; j < 4 && i+j <students.size(); j++) {
                if(j == 3 || i+j+1 >=students.size()) {
                    group += " & " + students.get(i + j);
                } else {
                    group += ", " + students.get(i + j);
                }
            }
            res.add(group);
        }

        return res;
    }

    public void loadFile(String filePath) throws FileNotFoundException {
        Scanner s = new Scanner(new File(filePath));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();
        students = list;
    }
}
