package com.booleanuk.core;

import com.booleanuk.RandomStudentSelector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CoreTest {

    @Test
    public void testShowMenu() {
        RandomStudentSelector randomStudentSelector = new RandomStudentSelector();
        String expected = "Welcome! /n/nPlease select an option./n/nA. Get a random student./nB. Get randomised pairs./nC. Get randomised groups of four.";
        Assertions.assertEquals(expected, randomStudentSelector.showMenu());
    }

    @Test
    public void testGetRandomStudent() {
        RandomStudentSelector randomStudentSelector = new RandomStudentSelector();
        randomStudentSelector.randomiser = new Random(100);
        Assertions.assertEquals("A", randomStudentSelector.getRandomStudent());
        Assertions.assertEquals("A", randomStudentSelector.getRandomStudent());
        Assertions.assertEquals("E", randomStudentSelector.getRandomStudent());
        Assertions.assertEquals("D", randomStudentSelector.getRandomStudent());
        Assertions.assertEquals("B", randomStudentSelector.getRandomStudent());
    }

    @Test
    public void testGetRandomPairs() {
        RandomStudentSelector randomStudentSelector = new RandomStudentSelector();
        randomStudentSelector.randomiser = new Random(100);
        randomStudentSelector.students = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));

        Assertions.assertEquals(new ArrayList<String>(Arrays.asList("C & F", "D & E", "A & B")), randomStudentSelector.getRandomPairs());
        Assertions.assertEquals(new ArrayList<String>(Arrays.asList("B & D", "E & A", "F & C")), randomStudentSelector.getRandomPairs());
    }

    @Test
    public void testGetRandomGroups() {
        RandomStudentSelector randomStudentSelector = new RandomStudentSelector();
        randomStudentSelector.randomiser = new Random(100);
        randomStudentSelector.students = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));

        Assertions.assertEquals(new ArrayList<String>(Arrays.asList("D, A, B & G", "F, E & C")), randomStudentSelector.getRandomGroups());
        Assertions.assertEquals(new ArrayList<String>(Arrays.asList("F, D, A & E", "C, B & G")), randomStudentSelector.getRandomGroups());
    }

    @Test
    public void testLoadFile() throws FileNotFoundException {
        RandomStudentSelector randomStudentSelector = new RandomStudentSelector();
        ArrayList<String> students = new ArrayList<>(Arrays.asList("P", "Q", "R", "S"));
        randomStudentSelector.loadFile("students.txt");
        Assertions.assertEquals(students, randomStudentSelector.students);
    }
}


