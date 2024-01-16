package com.booleanuk;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class RandomStudentSelectorTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testShowMenuOutputsStringOfOptions() {
        String menu = "This is a random student selector.\nS: Get random student.\nP: Get random pairs.\nG: Get random pair groups.\nX: Exit program.";
        RandomStudentSelector studentSelector = new RandomStudentSelector();
        studentSelector.showMenu();
        Assertions.assertEquals(menu, outputStreamCaptor.toString()
                .trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testGetRandomStudent() {
        RandomStudentSelector studentSelector = new RandomStudentSelector();
        studentSelector.randomiser = new Random(1000);
        Assertions.assertEquals(studentSelector.students[1], studentSelector.getRandomStudent());
        Assertions.assertEquals(studentSelector.students[1], studentSelector.getRandomStudent());
        Assertions.assertEquals(studentSelector.students[0], studentSelector.getRandomStudent());
    }

    @Test
    public void testGetPairsIsRandom() {
        RandomStudentSelector studentSelector = new RandomStudentSelector();
        studentSelector.randomiser = new Random(1000);
        Assertions.assertFalse(studentSelector.getPairs().isEmpty());
        String[] firstPair = {studentSelector.students[1], studentSelector.students[0]};
        Assertions.assertEquals(firstPair, studentSelector.getPairs().get(0));
    }

    @Test
    public void testGetPairsSize() {
        RandomStudentSelector studentSelector = new RandomStudentSelector();
        studentSelector.randomiser = new Random(1000);
        Assertions.assertEquals(Math.ceil((double) studentSelector.students.length /2), studentSelector.getPairs().size);
    }
}
