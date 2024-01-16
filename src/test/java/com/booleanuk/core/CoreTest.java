package com.booleanuk.core;

import com.booleanuk.Card;
import com.booleanuk.Deck;
import com.booleanuk.RandomStudents;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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

        Assertions.assertEquals("Emma Parker", rs.getRandomStudent());
        Assertions.assertEquals("Aiden Bennett", rs.getRandomStudent());
        Assertions.assertEquals("Liam Turner", rs.getRandomStudent());

    }

    /* Test Use Case 3*/
    @Test
    public void testGetRandomFourPairs(){
        RandomStudents rs = new RandomStudents();
        rs.setSeed(200);
        ArrayList<String[]> expected = new ArrayList<>();
        expected.add(new String[]{"Sophia Hayes", "Olivia Rodriguez"});
        expected.add(new String[]{"Ethan Thompson", "Liam Turner"});
        expected.add(new String[]{"Aiden Bennett", "Emma Parker"});
        expected.add(new String[]{"Ava Mitchell", "Noah Anderson"});
        expected.add(new String[]{"Mason Foster", ""});



        Assertions.assertArrayEquals(expected.toArray(), rs.getRandomPairs().toArray());
    }

    /* Test Use Case 4 */
    @Test
    public void testGetRandomGroups(){
        RandomStudents rs = new RandomStudents();
        rs.setSeed(300);
        ArrayList<String[]> expected = new ArrayList<>();
        expected.add(new String[]{"Liam Turner", "Ava Mitchell", "Olivia Rodriguez", "Sophia Hayes"});
        expected.add(new String[]{"Mason Foster", "Emma Parker", "Ethan Thompson", "Aiden Bennett"});
        Assertions.assertArrayEquals(expected.toArray(), rs.getRandomGroups().toArray());
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

    /* Tests for testing Poker - Domain model 2*/


    /*Tests for user story 1 - 3 */
    @Test
    public void testShuffleDeckResult(){
        Deck deck = new Deck();
        deck.shuffleDeck(200);
        ArrayList<Card> expected = deck.shuffleDeck(200);
        Assertions.assertArrayEquals(deck.getDeck().toArray(), expected.toArray());
    }
}
