package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class GameDriver {

	BlackjackDealer dealer = new BlackjackDealer();
	BlackjackPlayer player = new BlackjackPlayer();

//	static GameDriver gm = new GameDriver();
	Scanner kb = new Scanner(System.in);

//	public static void main(String[] args) {
//		gm.run();
//	}

	public void run() {
		System.out.println("Name?");
		String getName = kb.next();
		player.setName(getName);
boolean playAgain = true;
while (playAgain) {
		dealer.getHand().clear();
		player.getHand().clear();
		dealCards();
		hitOrStay();
		System.out.println("Play Again? :   y/n");
		String again = kb.next();
		if (again.equals("y")) {
			playAgain = true;
		}else if (again.equals("n")) {
			playAgain = false;
		}
	}
	}
	public void dealCards() {
		System.out.println("Dealing new Hand.");
		player.getHand().addCard(dealer.dealing());
		player.getHand().addCard(dealer.dealing());
		dealer.getHand().addCard(dealer.dealing());
		dealer.getHand().addCard(dealer.dealing());
		System.out.println(player.getHand() + " \n" + player.getHand().getHandValue() + "\n");
		System.out.println("Dealer Hand is : \n" + dealer.getHand().getInitDealerHand() + "\n");

	}

	public void hitOrStay() {
		boolean win = true;

		while (win) {

			int hitStay = 0;
		
			if (player.getHand().isBlackjack()) {
				System.out.println("Player Blackjack!");
				win = false;
			} else if (dealer.getHand().isBlackjack()) {
				System.out.println("Dealer Blackjack!");
				win = false;
			} else if (!player.getHand().isBlackjack() && !dealer.getHand().isBlackjack()) {
				System.out.println();
				System.out.println();
			}
			hitMenu();
			hitStay = kb.nextInt();

			switch (hitStay) {
			case 1:
				System.out.println("Getting one card.");
				player.getHand().addCard(dealer.dealing());
				hitMenu();
				if (player.getHand().isBust()) {

					System.out.println("You Busted!");
					win = false;
					break;
				}
				break;
			case 2:
				System.out.println("You stay");
				dealersTurn();
				if (dealer.getHand().isBust()) {
					win = false;
					break;
				}

				win = false;
				break;
			default:
				break;

			}
		}
	}

	public void dealersTurn() {
		while (dealer.getHand().getHandValue() < 17 && !dealer.getHand().isBust()) {
			dealer.getHand().addCard(dealer.dealing());
			System.out.println("|--------------|");
			System.out.println("| Dealer Hits. |");
			System.out.println("|--------------|");
			System.out.println();
			System.out.println("Dealer Hand is : \n" + dealer.getHand() + " \n" + dealer.getHand().getHandValue() + "\n");
			if (dealer.getHand().isBust()) {
				System.out.println("Dealer Busted!");

			}
		}
		if (dealer.getHand().getHandValue() > player.getHand().getHandValue() && !dealer.getHand().isBust()) {
			displayCards();
			System.out.println("Dealer Wins");
			player.getHand().foundWinner();
		} else if (dealer.getHand().getHandValue() < player.getHand().getHandValue()) {
			displayCards();
			System.out.println("You Win");
			player.getHand().foundWinner();
		} else if (dealer.getHand().getHandValue() == player.getHand().getHandValue()) {
			displayCards();
			System.out.println("Push");

		}
	}

	public void hitMenu() {
		System.out.println();
		System.out.println("––––––––––––––––––------ - -  -  -  -");
		System.out.println("Your Cards :");
		System.out.println(player.getHand() + " \n" + player.getHand().getHandValue() + "\n");
		System.out.println("––––––––––––––––––------ - -  -  -  -");
		System.out.println("Dealer Cards : \n" + dealer.getHand().getInitDealerHand() + "\n");
		System.out.println("––––––––––––––––––------ - -  -  -  -");
		System.out.println("|––––––––––-|");
		System.out.println("|  1 to hit |");
		System.out.println("|––––––––––-|");
		System.out.println("| 2 to stay |");
		System.out.println("|––––––––––-|");
	}

	public void displayCards() {
		System.out.println("Your hand is : \n" + player.getHand() + " \n" + player.getHand().getHandValue() + "\n");
		System.out.println("Dealer Hand is : \n" + dealer.getHand() + " \n" + dealer.getHand().getHandValue() + "\n");
	}

}
