package com.booleanuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomStudentSelectorTest {

    @Test
    public void testGetRandomStudent() {
        String[] students = {"Gustav", "Alexandra", "Alex", "Sebastian"};

        RandomStudentSelector selector = new RandomStudentSelector(students);
        selector.randomiser = new Random(500);
        Assertions.assertEquals(selector.listOfNames[3], selector.getRandomStudent());
    }



}
