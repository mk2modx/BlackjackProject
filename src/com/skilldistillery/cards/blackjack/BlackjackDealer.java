package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackDealer extends AbstractBlackjackPlayer {
Deck deck = new Deck();

	public Card dealing() {
		
		
		return deck.dealCard();//removing 1 card from the deck
	}

}
