package com.gabrielvillarreal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * 1.b 
 * 		i.
 * 		1. - added a suits list to be able to distinguish between each set of 13 cards per suit. 
 */
public class Deck {

List<Card> cards = new ArrayList<Card>();
String [] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
List<String> suits = new ArrayList<String>();

/*
 * 1.b 
 * 		ii.
 * 		3.
 * 
 */

public Deck () {
	Collections.addAll(suits, suit);
	for (String suit : suits) {
		for (int i = 2; i < 15; i++) {
			cards.add(new Card(i, suit));
		}
	}
}

/*
 * 1.b 
 * 		ii.
 * 		1.
 * 		2.
 */

public void shuffle() {
	Collections.shuffle(cards, new Random());			
}
// uses Card as the return method to be used by other cards in other classes.
public Card draw() {
	return cards.remove(0);
}
	
public List<Card> getCards() {
	return cards;
}

@Override
public String toString() {
	return "Deck [cards=" + cards + ", suit=" + Arrays.toString(suit) + ", suits=" + suits + "]";
}

public void setCards(List<Card> cards) {
	this.cards = cards;
}
}
