package com.booleanuk;

import java.util.ArrayList;

public class Table {


    ArrayList<Hand> hands;

    public Table(){
        hands = new ArrayList<>();
    }

    public ArrayList<Hand> createFourHands(){
        for(int i = 0; i < 4; i++){
            Hand hand = new Hand();
            hand.createHand(5);
            hands.add(hand);
        }
        return hands;
    }

    public String viewHandsAsString(){
        StringBuilder sb = new StringBuilder();
        for(Hand h : hands){
            for(Card c : h.getHand()){
                sb.append(c.getCardInfo() + "\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
