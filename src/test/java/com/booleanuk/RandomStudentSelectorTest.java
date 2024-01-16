package com.booleanuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomStudentSelectorTest {

    @Test
    public void testGetRandomStudent() {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Gustav", "Alexandra", "Alex", "Sebastian"));

        RandomStudentSelector selector = new RandomStudentSelector(students);
        selector.randomiser = new Random(500);
        Assertions.assertEquals(selector.listOfNames.get(3), selector.getRandomStudent());
    }

    @Test
    public void testGetRandomPairsEvenNumber() {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Gustav", "Alexandra", "Alex", "Sebastian", "Paulina", "Hanna"));
        ArrayList<String> firstPair = new ArrayList<>(Arrays.asList("Sebastian", "Hanna"));

        RandomStudentSelector selector = new RandomStudentSelector(students);
        selector.randomiser = new Random(500);

        Assertions.assertEquals(firstPair, selector.getRandomPairs().get(0));
    }

    @Test
    public void testGetRandomPairsUnevenNumber() {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Gustav", "Alexandra", "Alex", "Sebastian", "Paulina"));
        ArrayList<String> firstPair = new ArrayList<>(Arrays.asList("Gustav", "Alexandra"));

        RandomStudentSelector selector = new RandomStudentSelector(students);
        selector.randomiser = new Random(500);

        ArrayList<ArrayList<String>> studentPairs = selector.getRandomPairs();

        Assertions.assertEquals(firstPair, studentPairs.get(0));

        Assertions.assertEquals("Sebastian", studentPairs.get(2).get(0));

        Assertions.assertEquals(3, studentPairs.size());
    }

    @Test
    public void testGetRandomFourGroupsDivisibleByFour() {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Gustav", "Alexandra", "Alex", "Sebastian", "Paulina", "Hanna", "Elias", "Zuzanna"));
        ArrayList<String> firstGroup = new ArrayList<>(Arrays.asList("Elias", "Paulina", "Alex", "Sebastian"));

        RandomStudentSelector selector = new RandomStudentSelector(students);
        selector.randomiser = new Random(500);

        ArrayList<ArrayList<String>> studentGroups = selector.getRandomFourGroups();

        Assertions.assertEquals(firstGroup, studentGroups.get(0));
    }

    @Test
    public void testGetRandomFourGroupsNotDivisibleByFour() {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Gustav", "Alexandra", "Alex", "Sebastian", "Paulina",
                "Hanna", "Elias", "Zuzanna", "Matilda", "Oskar"));
        ArrayList<String> firstGroup = new ArrayList<>(Arrays.asList("Hanna", "Elias", "Sebastian", "Matilda"));
        ArrayList<String> lastGroup = new ArrayList<>(Arrays.asList("Alex", "Alexandra"));

        RandomStudentSelector selector = new RandomStudentSelector(students);
        selector.randomiser = new Random(500);

        ArrayList<ArrayList<String>> studentGroups = selector.getRandomFourGroups();

        Assertions.assertEquals(firstGroup, studentGroups.get(0));

        Assertions.assertEquals(lastGroup, studentGroups.get(2));

        Assertions.assertEquals(3, studentGroups.size());
    }

    @Test
    public void testGetTextFromFile() {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Gustav", "Alexandra", "Alex", "Sebastian", "Paulina",
                "Hanna", "Elias", "Zuzanna", "Matilda", "Oskar"));

        RandomStudentSelector selector = new RandomStudentSelector();

        String filePath = "resources/students.txt";
        selector.loadTextFile(filePath);
        Assertions.assertEquals(students, selector.listOfNames);
    }
}
