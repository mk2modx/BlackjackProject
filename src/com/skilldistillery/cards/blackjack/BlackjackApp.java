package com.skilldistillery.cards.blackjack;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackApp {
	BlackjackDealer dealer = new BlackjackDealer();
	BlackjackPlayer player = new BlackjackPlayer();

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		
		bja.launch();
		
	}

	private void launch() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = kb.nextLine();
		player.setName(name);
	
		
//		do {
			dealer.getHand().clear();
			player.getHand().clear();
			dealCards();

		System.out.println(player.getName() + " your hand is :");

		displayMenu();
		while (player.getHand().isBust() || dealer.getHand().isBust()) {
			int hitStay = 0;
			hitStay = kb.nextInt();
			switch (hitStay) {
			case 1:
				System.out.println("Getting one card.");
				player.getHand().addCard(dealer.dealing());
				displayMenu();
				if (!player.getHand().isBust()) {
					System.out.println("You Busted!");
				
				} 
				break;

			case 2:
				 if(dealer.getHand().isBlackjack()) {
					System.out.println("Dealer Blackjack!");
				}
				System.out.println("You stay");
				dealerHits();
				break;
			default:
				break;

			}
		}
//		}while (dealer.getDeck().checkDeckSize() > 10);

	}

	public void dealCards() {
		System.out.println("Dealing NEW hand.");
		player.getHand().addCard(dealer.dealing());
		player.getHand().addCard(dealer.dealing());
		dealer.getHand().addCard(dealer.dealing());
		dealer.getHand().addCard(dealer.dealing());
		 if(player.getHand().isBlackjack()) {
			System.out.println("Player Blackjack!");
		}
	}

	public void displayMenu() {
		System.out.println(player.getHand() + " \n" + player.getHand().getHandValue()+"\n");
		System.out.println("Dealer Hand is : \n" + dealer.getHand().getInitDealerHand()+"\n");
		System.out.println("1 to hit");
		System.out.println("2 to stay");
	}
	public void displayCards() {
		System.out.println("Your hand is : \n" + player.getHand() + " \n" + player.getHand().getHandValue()+"\n");
		System.out.println("Dealer Hand is : \n" + dealer.getHand() + " " + dealer.getHand().getHandValue()+"\n");	}

	public void dealerHits() {
		displayCards();
		while (dealer.getHand().getHandValue() < 17) {
			dealer.getHand().addCard(dealer.dealing());
			System.out.println("Dealer Hits.");
			System.out.println("Dealer Hand is : \n" + dealer.getHand() + " " + dealer.getHand().getHandValue()+"\n");
			if (!dealer.getHand().isBust()) {
				System.out.println("Dealer Busted!");
			}
		}
		if (dealer.getHand().isBust() && dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
			displayCards();
			System.out.println("Dealer Wins");
			
		} else if (dealer.getHand().getHandValue() < player.getHand().getHandValue()){
			displayCards();
			
			System.out.println("You Win");
		}else if (dealer.getHand().getHandValue() < player.getHand().getHandValue()){
			
			displayCards();
			System.out.println("Push");
		}

	}

}
