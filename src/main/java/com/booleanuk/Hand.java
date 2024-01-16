package com.booleanuk;

import java.util.ArrayList;

public class Hand {
    Deck deck = Deck.getInstance();
    ArrayList<Card> hand;
    public Hand(){

    }

    public ArrayList<Card> createHand(int num){
        hand = deck.getCards(num);
        return hand;
    }
}
