package com.booleanuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomStudentSelectorTest {

    @Test
    public void testGetRandomStudent() {
        RandomStudentSelector selector = new RandomStudentSelector();
        selector.randomiser = new Random(50);
        Assertions.assertEquals(selector.listOfNames[0], selector.getRandomStudent());
    }
}
