package com.booleanuk.core;

import com.booleanuk.RandomStudentSelector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoreTest {

    @Test
    public void testShowMenu() {
        RandomStudentSelector randomStudentSelector = new RandomStudentSelector();
        String expected = "Welcome! /n/nPlease select an option./n/nA. Get a random student./nB. Get randomised pairs./nC. Get randomised groups of four.";
        Assertions.assertEquals(expected, randomStudentSelector.showMenu());
    }
}


