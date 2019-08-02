package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

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
	
}
