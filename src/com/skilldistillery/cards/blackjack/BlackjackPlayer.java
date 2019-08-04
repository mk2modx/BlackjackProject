package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackPlayer extends AbstractBlackjackPlayer{
private String name;

public BlackjackPlayer() {
	
}

public BlackjackPlayer(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public Card hit(Deck deck) {
	// return card from deck
	return deck.dealCard() ;
}
public void stay() {
	// stand move to dealer 
}
}
