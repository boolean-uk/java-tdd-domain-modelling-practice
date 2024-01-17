package com.booleanuk.extension;

import com.booleanuk.Card;
import com.booleanuk.Deck;
import com.booleanuk.Suit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

public class ExtensionTest {

    @Test
    public void createDeckTest() {
        Deck deck = new Deck();
        Assertions.assertEquals(52, deck.cards.size());
    }

    @Test
    public void shuffleDeckTest() {
        Deck deck = new Deck(new Random(100));
        ArrayList<Card> expected = new ArrayList<>(Arrays.asList(new Card(Suit.SPADES, 13), new Card(Suit.HEARTS, 10), new Card(Suit.DIAMONDS, 13)));
        Assertions.assertEquals(expected, deck.cards.subList(0,3));
    }
}
