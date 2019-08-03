package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackDealer extends AbstractBlackjackPlayer {
private Deck deck = new Deck();

	public Card dealing() {
		
		
		return deck.dealCard();//removing 1 card from the deck
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

}
