package com.booleanuk;

import java.util.ArrayList;

public class Deck {
    public ArrayList<Card> cards;

    public Deck() {
        create();
    }


    private void create() {
        cards = new ArrayList<>();
        for(int value = 2; value <= 14; value++) {
            cards.add(new Card(Suit.HEARTS, value));
            cards.add(new Card(Suit.CLUBS, value));
            cards.add(new Card(Suit.DIAMONDS, value));
            cards.add(new Card(Suit.SPADES, value));
        }
    }
}
