package com.booleanuk.core;

import com.booleanuk.*;
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
        String expected = "Choose an option:\n" +
                          "1. Select a random student.\n" +
                          "2. Selected Random Pairs from Student List.\n" +
                          "3. Select Random Groups from Student List\n" +
                          "4. Exit program";
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
        Deck deck = Deck.getInstance();
        deck.shuffleDeck(200);
        ArrayList<Card> expected = deck.shuffleDeck(200);
        Assertions.assertArrayEquals(deck.getDeck().toArray(), expected.toArray());
    }


    /* Test user story 4 */
    @Test
    public void testCreateHand(){
        Deck.resetInstance();
        Deck deck = Deck.getInstance();
        deck.shuffleDeck(20032);
        Hand hand = new Hand();
        ArrayList<Card> expected = new ArrayList<>();
        expected.add(new Card("Diamonds", "9"));
        expected.add(new Card("Spades", "10"));
        expected.add(new Card("Spades", "7"));
        ArrayList<Card> actual = hand.createHand(3);
        Assertions.assertEquals(expected.get(0).getCardInfo(), actual.get(0).getCardInfo() );
        Assertions.assertEquals(expected.get(1).getCardInfo(), actual.get(1).getCardInfo() );
        Assertions.assertEquals(expected.get(2).getCardInfo(), actual.get(2).getCardInfo() );
        Deck.resetInstance();
    }

    /* Test  user story 5*/
    @Test
    public void testCreateFourHandsWithFiveCards(){
        Deck.resetInstance();
        Deck deck = Deck.getInstance();
        deck.shuffleDeck(2003);
        Table table = new Table();
        table.createFourHands();
        String expected = "Spades King\n" +
                          "Diamonds King\n" +
                          "Hearts 7\n" +
                          "Diamonds 2\n" +
                          "Clubs 5\n" +
                          "\n" +
                          "Spades 3\n" +
                          "Clubs Queen\n" +
                          "Clubs 2\n" +
                          "Spades Queen\n" +
                          "Spades Jack\n" +
                          "\n" +
                          "Clubs Jack\n" +
                          "Spades 5\n" +
                          "Clubs King\n" +
                          "Spades 7\n" +
                          "Hearts King\n" +
                          "\n" +
                          "Hearts 10\n" +
                          "Spades 6\n" +
                          "Diamonds 8\n" +
                          "Spades 8\n" +
                          "Diamonds 4\n" +
                          "\n";
        Assertions.assertEquals(expected, table.viewHandsAsString());

    }

    /* Test User story 6*/

    @Test
    public void testSeeingTopOfTheDeck(){
        Deck.resetInstance();
        Deck deck = Deck.getInstance();
        deck.shuffleDeck(400);
        System.out.println(deck.seeTopCard().getCardInfo());
        String expected = new Card("Diamonds", "5").getCardInfo();
        Assertions.assertEquals(expected, deck.seeTopCard().getCardInfo());
    }

    /* Test user story 7*/
    @Test
    public void testCutCardAndSeeArbitraryPoint() {
        Deck.resetInstance();
        Deck deck = Deck.getInstance();
        deck.shuffleDeck(400);
        String expected = new Card("Diamonds", "2").getCardInfo();
        Assertions.assertEquals(expected, deck.cutDeck(20, "Bottom").getCardInfo());
    }

}



