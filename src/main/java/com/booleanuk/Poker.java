package com.booleanuk;

import java.util.ArrayList;

public class Poker {

	public Poker(){

	}
	public Card[] createDeck(){
		Card[] deck = new Card[52];
		for (int i = 0; i < deck.length; i++) {
			String value="";
			String suit= "";
			switch(i/13){
				case 0: suit="C";break;
				case 1: suit="S";break;
				case 2: suit="H";break;
				case 3: suit="D";break;

			}
			switch(i%13+1){
				case 1: value="A";break;
				case 11: value="J";break;
				case 12: value="Q";break;
				case 13: value="K";break;
				default:value= Integer.toString(i%13+1);
			}
			System.out.print(value);
			System.out.print(" "+suit);
			System.out.print("\n");
		}
		return deck;
	}

	public static void main(String[] args) {
		Poker p = new Poker();
		p.createDeck();
	}
}
