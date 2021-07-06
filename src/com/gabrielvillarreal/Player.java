package com.gabrielvillarreal;

import java.util.ArrayList;
import java.util.List;

/*
 * 1.c 
 * 		i.
 * 		1.
 * 		2.
 * 		3.
 */

public class Player {
List<Card> hand = new ArrayList<Card> ();
int score;
String name;

public Player (String nom) {
name = nom;
score = 0;
}

/*
 * 1.c 
 * 		i.
 * 		1.
 * 		2.
 * 		3.
 * 		4.
 */

public void describe (List<Card> hand2) {
	System.out.println("Player " + name + " has these cards in their hand: \n" + hand2);
	for (Card c : hand2) {
		c.getValue();
	}
}
// Uses the Card object as a reference to return type
public Card flip () {
	return hand.remove(0);
}
public void draw(Deck d) {
    hand.add(d.draw());
}
public void incrementScore () {
	score = score + 1;
}

public List<Card> getHand() {
	return hand;
}

public void setHand(List<Card> hand) {
	this.hand = hand;
}

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
