package com.booleanuk.core;

import com.booleanuk.RandomStudents;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoreTest {

    /* Tests for testing RandomStudents - Domain model 1 */

    /*Test Use Case 1*/
    @Test
    public void testReturningMenuString(){
        RandomStudents rs = new RandomStudents();
        String expected = "Choose an option:\n" + "1. Select a random student.\n"
                + "2. Selected Random Pairs from Student List.\n" + "3. Select Random Groups from Student List\n"
                + "4. Exit program";
        Assertions.assertEquals(expected, rs.displayString());
    }

}
