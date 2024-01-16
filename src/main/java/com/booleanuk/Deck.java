package com.booleanuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;
    public Deck(){
        deck = generateDeck();
    }
    public ArrayList<Card>shuffleDeck(int seed){
        Collections.shuffle(deck, new Random(seed));
        return deck;
    }
    public ArrayList<Card> generateDeck(){
        ArrayList<Card> temp = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                temp.add(new Card(suit, rank));
            }
        }
        return temp;
    }


    public ArrayList<Card> getDeck(){
        return deck;
    }
}
