package com.booleanuk.core;

import com.booleanuk.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CoreTest {
    @Test
    public void testRandomFunction(){
        Main main = new Main();
        Random random = new Random(100);
        Assertions.assertEquals(main.functions[1],main.getFunctions());

    }

    @Test
    public  void testOptionRandomStudent(){
        Main main = new Main();
        Random random = new Random(100);
        Assertions.assertEquals(main.lisOfNames[1],main.getRandomStudents());
    }
    @Test
    public  void testOptionRandomStudentPairs(){
        Main main = new Main();
        Random random = new Random(100);
        Assertions.assertEquals(main.lisOfNames[1]+main.lisOfNames[4],main.returnPairs());
    }




}
