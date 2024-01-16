package com.booleanuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;
    private static Deck instance;

    public Deck(){
        deck = generateDeck();

    }

    public static Deck getInstance() {
        if (instance == null) {
            synchronized (Deck.class) {
                if (instance == null) {
                    instance = new Deck();
                }
            }
        }
        return instance;
    }

    public ArrayList<Card>shuffleDeck(int seed){
        ArrayList<Card> temp = deck;
        Collections.shuffle(this.deck, new Random(seed));
        return this.deck;
    }
    public ArrayList<Card>shuffleDeck(){
        Collections.shuffle(deck, new Random());
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
    public ArrayList<Card> getCards(int num){
        ArrayList<Card> hand = new ArrayList<>();
        if(deck.size() - num < 0){
            return null;
        }
        for (int i = deck.size() - 1; i >= (deck.size() - num); i--) {
            hand.add(deck.get(i));

        }
        deck.subList(deck.size() - num, deck.size()).clear();
        return hand;
    }

    public ArrayList<Card> getDeck(){
        return deck;
    }
}
