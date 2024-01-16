package com.booleanuk.extension;

import com.booleanuk.Deck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtensionTest {

    @Test
    public void createDeckTest() {
        Deck deck = new Deck();
        Assertions.assertEquals(52, deck.cards.size());
    }
}
