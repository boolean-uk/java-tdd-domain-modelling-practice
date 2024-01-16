package com.booleanuk.core;

import com.booleanuk.RandomStudentSelector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}


