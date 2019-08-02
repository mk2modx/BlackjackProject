package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DealCards {

	public static void main(String[] args) {
		DealCards d = new DealCards();
		
		d.run();
		
	}
	
	public void run() {
		
		Deck card = new Deck();//bring deck
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many cards do you want?");
		
		try {
			int amount = kb.nextInt();
			if (amount < 52) {
				card.shuffle();
				List<Card> hand = new ArrayList<>();
				int totalValue = 0;
				for (int i = 0; i < amount; i++) {
					Card c = card.dealCard();
					totalValue += c.getValue();
					hand.add(c);
				}
				for (Card card2 : hand) {
				
					System.out.println(card2 + " " + totalValue);
					
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("choose again");
		}
		
	}

}
