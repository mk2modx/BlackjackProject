package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackDealer extends AbstractBlackjackPlayer {
private Deck deck = new Deck();

	public Card dealing() {
		
		
		return deck.dealCard();
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	public Card hit() {
		// return card from deck
		return null;
	}
	public void stay() {
		// stand move to dealer 
	}

}
