package com.gabrielvillarreal;

/*
 * 1.a 
 * 		i.
 * 		1.
 * 		2.
 */

public class Card {

private int value;
private String name;

public Card (int rank, String string) {
value = rank;

switch(rank) {
case 2: name = "Two";
    break;
case 3: name = "Three";
    break;
case 4: name = "Four";
    break;
case 5: name = "Five";
    break;
case 6: name = "Six";
    break;
case 7: name = "Seven";
    break;
case 8: name = "Eight";
    break;
case 9: name = "Nine";
    break;
case 10: name = "Ten";
    break;
case 11: name = "Jack";
    break;
case 12: name = "Queen";
    break;
case 13: name = "King";
    break;
case 14: name = "Ace";
    break;
}

name += " of " + string;
	
}

/*
 * 1.a 
 * 		ii.
 * 		1.
 * 		2.
 */

public void describe () {
	System.out.printf("The next card is: " + name +  " with a value of " + value + "\n");
}

@Override
public String toString() {
	return "Card [value=" + value + ", name=" + name + "]";
}

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
