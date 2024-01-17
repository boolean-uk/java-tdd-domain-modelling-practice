package com.booleanuk;

public class Card {
    public Suit suit;
    public int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Card)) {
            return false;
        }
        Card other = (Card) obj;
        return this.suit == other.suit && this.value == other.value;
    }
}

