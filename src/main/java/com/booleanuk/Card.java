package com.booleanuk;

public class Card {
    private String suit;
    private String rank;
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }

    public String getCardInfo(){
        return this.suit + " " +  this.rank;
    }
}
