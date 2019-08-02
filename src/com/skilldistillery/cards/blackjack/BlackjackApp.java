package com.skilldistillery.cards.blackjack;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackApp {
	Deck singleDeck = new Deck();
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
		dealCards();

		System.out.println(player.getName() + " your hand is :");
		System.out.println(player.getHand() + " " + player.getHand().getHandValue());
		System.out.println("Dealer Hand is : \n" + dealer.getHand() + " " + dealer.getHand().getHandValue());

		System.out.println(singleDeck.checkDeckSize());
	}

	public void dealCards() {

		player.getHand().addCard(dealer.dealing());
		player.getHand().addCard(dealer.dealing());
		dealer.getHand().addCard(dealer.dealing());
		dealer.getHand().addCard(dealer.dealing());

	}

}
