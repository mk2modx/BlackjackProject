package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public abstract class AbstractBlackjackPlayer {

	private BlackjackHand hand = new BlackjackHand();
	
	
	public Card hit() {
		// return card from deck
		return null;
	}
	public void stay() {
		// stand move to dealer 
	}
	public BlackjackHand getHand() {
		
		return hand;
	}
	public void setHand(BlackjackHand hand) {
		this.hand = hand;
	}
	
}
