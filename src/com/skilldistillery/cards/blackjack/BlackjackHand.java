package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.AbstractHand;
import com.skilldistillery.cards.common.Card;

public class BlackjackHand extends AbstractHand {

	@Override
	public int getHandValue() {
		int v = 0;
		for (Card card : cards) {
			v += card.getValue();
		}
		
		return v;
	}
public boolean isBlackjack() {
	return true;
}

public boolean isBust() {
	return true;
}

public boolean isHard() {
	return true;
}
public boolean isSoft() {
	return true;
}
}
