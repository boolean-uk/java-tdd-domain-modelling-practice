package com.booleanuk.core;

import com.booleanuk.Card;
import com.booleanuk.Main;
import com.booleanuk.Poker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class CoreTest {

	@Test
	public void createDeckTest(){
		Poker poker = new Poker();
		Card[] deck = poker.createDeck();
		Assertions.assertEquals(deck.length,52);

	}
	@Test
	public void randomStudentTest(){
		Main main= new Main();
		main.randomiser=new Random(100);
		Assertions.assertEquals("Asda Asdson", main.randomStudent());
		Assertions.assertEquals("Asda Asdson", main.randomStudent());
		Assertions.assertEquals("Erik Ek", main.randomStudent());
	}
	@Test
	public void pairStudentsTest(){
		Main main= new Main();
		main.randomiser=new Random(100);
		Assertions.assertEquals("Asda Asdson, Erik Ek\nDavid Dill, Bob Bobsson\nClara Cluir, ", main.pairStudents());
		Assertions.assertEquals("Clara Cluir, Bob Bobsson\nErik Ek, Asda Asdson\nDavid Dill, ", main.pairStudents());
	}
	@Test
	public void peerStudentsTest(){
		Main main= new Main();
		main.randomiser=new Random(100);
		Assertions.assertEquals("Asda Asdson, Erik Ek, David Dill\nBob Bobsson, Clara Cluir, ", main.peerStudents());
		Assertions.assertEquals("Clara Cluir, Bob Bobsson, Erik Ek\nAsda Asdson, David Dill, ", main.peerStudents());
	}
	@Test
	public void showStudentsTest(){
		Main main = new Main();
		Assertions.assertEquals("Asda Asdson\nBob Bobsson\nClara Cluir\nDavid Dill\nErik Ek\n",main.showStudents());
	}
	@Test
	public void showMenueTest(){
		Main main = new Main();
		Assertions.assertEquals("Options:\n1: Random student.\n2: Pair students.\n3: Peer students.\n4: List students\nq: Quit.",main.showMenue());
	}
}
