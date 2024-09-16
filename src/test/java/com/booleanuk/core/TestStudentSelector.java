package com.booleanuk.core;

import com.booleanuk.StudentSelector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestStudentSelector {
    @Test
    public void testLoadFile(){
        StudentSelector ss = new StudentSelector("./././studentfile.txt");

        Assertions.assertEquals(30, ss.students.length());
    }

    @Test
    public void testRandomStudent(){
        StudentSelector ss = new StudentSelector();
        ss.randomiser = new Random(1);

        Assertions.assertEquals(ss.randomStudent(), ss.student[new random(100)]);
    }

    @Test
    public void testRandomPairs(){
        StudentSelector ss = new StudentSelector();
        ss.randomiser = new Random(1);

    }

    @Test
    public void testRandomGroups(){

    }

    @Test
    public void testMenu(){

    }
}
