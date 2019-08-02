package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards;// holds a deck of card // can be declared in constructor

	public Deck() {
		cards = makeDeck();
	}

	public List<Card> makeDeck() {

		List<Card> cards = new ArrayList<>();
		for (Suit eachS : Suit.values()) {//for each suit , iterate over with each rank
			for (Rank eachR : Rank.values()) {
				cards.add(new Card(eachR, eachS));
			}
		}
		Collections.shuffle(cards);
		return cards;
	}

	public int checkDeckSize() {
		return cards.size();
	}

	public Card dealCard() {
		return cards.remove(0);
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
}
