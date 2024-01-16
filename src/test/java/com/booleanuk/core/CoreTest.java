package com.booleanuk.core;

import com.booleanuk.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CoreTest {

//1. When I run the program I see a menu giving me options to use each of the functions of the program.
    /*
    @Test
    public void testUserMenuInputShouldBeB() {
        Student student = new Student();
        String userInput = student.userMenu();
        Assertions.assertEquals("B", userInput.toUpperCase());
    }
     */

//2. When I select the option it will output a randomly chosen student from the list.
    @Test
    public void randomStudentTest() {
        Student student = new Student();
        student.randomiser = new Random(100);
        Assertions.assertEquals(student.students[1], student.randomStudent());
        Assertions.assertEquals(student.students[4], student.randomStudent());
        Assertions.assertEquals(student.students[4], student.randomStudent());
        Assertions.assertEquals(student.students[0], student.randomStudent());
        Assertions.assertEquals(student.students[1], student.randomStudent());
    }

//3. When I select the option it will output a list of all of the students as randomly chosen pairs.

//4. When I select the option it will output a random list of Peer Groups for all of the students (groups of 4 students).

//5. When I run the program it should load the list of current students from a text file.


}
