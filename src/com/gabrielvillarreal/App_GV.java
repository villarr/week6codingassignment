package com.gabrielvillarreal;

public class App_GV {
	/*
	* 2.
	*/
	public static void main(String[] args) {
	/*
	* 3. Named after my 2 cats, Henry and Louie. They always like to fight... so it is perfect they are playing War. :)
	* 	 Also wanted to check deck contents to make sure the deck loop is working as well as the shuffled contents. 
	*/
	Player henry = new Player("henry");
	Player louie = new Player("louie");
	Deck d = new Deck ();
	System.out.println("\nThis is the original deck:\n");
	for (Card s : d.getCards()) {
		System.out.println(s.toString());
	}
	System.out.println("\nThis is the shuffled deck:\n");
	d.shuffle();
	for (Card s : d.getCards()) {
		System.out.println(s.toString());
	}
	System.out.println("\nThe size of the deck is " + d.cards.size() + " cards. Time to play.\n");
	/*
	* 4. Deals based on even and 1st and 2nd order. Also wanted to check and make sure the hands were even. 
	*/
	for (int i = 0; i < 52; i++) {
		if (i % 2 == 0) {
			henry.draw(d);
		}
		else {
			louie.draw(d);
		}
	}
	System.out.println("Henry's hand has " + henry.hand.size() + " cards in it. \n");
	System.out.println("Louie's hand has " + louie.hand.size() + " cards in it. \n");
	System.out.println(d.cards.size());
	/*
	* 5. Using the sysouts and round counter keep track of the scores and rounds played better.
	* 6. 
	*/
	
	
	for (int i = 1;(louie.hand.size() > 0 && henry.hand.size() > 0); i ++) {
		Card henryc = henry.flip();
		Card louiec = louie.flip();
		int game = i;
		System.out.println("\nRound: " + game + "\n");
		if (henryc.getValue() > louiec.getValue()) {
			henry.incrementScore();
			System.out.println("Henry's score is:  " + henry.getScore() + "\n");
			System.out.println("Louie's score is: " + louie.getScore() + "\n");
		}
		else if (louiec.getValue() > henryc.getValue()) {
			louie.incrementScore();
			System.out.println("Henry's score is:  " + henry.getScore() + "\n");
			System.out.println("Louie's score is: " + louie.getScore() + "\n");
		}
		else if (henryc.getValue() == louiec.getValue()) {
			
			System.out.println("\nIt is time for War!!\n");
			Card henryc1 = henry.flip();
			Card louiec1 = louie.flip();
			if (henryc1.getValue() > louiec1.getValue()) {
				henry.incrementScore();
				System.out.println("Henry's score is:  " + henry.getScore() + "\n");
				System.out.println("Louie's score is: " + louie.getScore() + "\n");
			}
			else if (louiec1.getValue() > henryc1.getValue()) {
				louie.incrementScore();
				System.out.println("Henry's score is:  " + henry.getScore() + "\n");
				System.out.println("Louie's score is: " + louie.getScore() + "\n");
		}
			
	}
	}
	/*
	* 7.
	*/	
	if (henry.getScore() > louie.getScore()) {
		System.out.println("Henry is the winner!");
	}
	else if (louie.getScore() > henry.getScore()) {
		System.out.println("Louie is the winner!");
	}
	else { 
		System.out.println("It was a DRAW! Prepare for another game of War!");
	}
	}
}

		
	
