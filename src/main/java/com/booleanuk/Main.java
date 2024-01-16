package com.booleanuk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        RandomStudentSelector rss = new RandomStudentSelector();
        rss.randomiser = new Random(100);
        for(int i = 0; i < 5; i++) {
            System.out.println(rss.getRandomStudent());
        }
        rss.randomiser = new Random(100);

        rss.students = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        for(int i = 0; i < 2; i++) {
            System.out.println(rss.getRandomPairs());
        }
    }
}
