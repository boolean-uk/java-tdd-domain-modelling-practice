package com.booleanuk.core;

import com.booleanuk.RandomStudents;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CoreTest {

    /* Tests for testing RandomStudents - Domain model 1 */

    /*Test Use Case 1*/
    @Test
    public void testReturningMenuString(){
        RandomStudents rs = new RandomStudents();
        String expected = """
                Choose an option:
                1. Select a random student.
                2. Selected Random Pairs from Student List.
                3. Select Random Groups from Student List
                4. Exit program""";
        Assertions.assertEquals(expected, rs.displayString());
    }
    /* Test Use Case 2*/
    @Test
    public void testGetThreeRandomStudents(){
        RandomStudents rs = new RandomStudents();
        rs.setSeed(230);

        Assertions.assertEquals("Harper Evans", rs.getRandomStudent());
        Assertions.assertEquals("Mason Foster", rs.getRandomStudent());
        Assertions.assertEquals("Lucas Sullivan", rs.getRandomStudent());

    }



    /* Test Use Case 5 */
    @Test
    public void testCorrectReadListFirstFiveNames(){
        RandomStudents rs = new RandomStudents();
        Assertions.assertEquals("Ethan Thompson", rs.studentList.get(0));
        Assertions.assertEquals("Olivia Rodriguez", rs.studentList.get(1));
        Assertions.assertEquals("Mason Foster", rs.studentList.get(2));
        Assertions.assertEquals("Ava Mitchell", rs.studentList.get(3));
        Assertions.assertEquals("Liam Turner", rs.studentList.get(4));



    }

}
