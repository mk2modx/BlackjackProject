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
	public Card getInitDealerHand() {
		
		
			
			return cards.get(0);
		}
		
	
public boolean isBlackjack() {
	if(this.getHandValue() == 21) {
		return true;
	}
	return false;
}

public boolean isBust() {
if(this.getHandValue() > 21) {

	return true;
}
	return false;
}
public boolean foundWinner() {
	
	return true;
}

public boolean isHard() {
	return true;
}
public boolean isSoft() {
	return true;
}
}
