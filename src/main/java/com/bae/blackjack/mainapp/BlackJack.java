package com.bae.blackjack.mainapp;



public class BlackJack {
	public static void main(String[] args) {
	
	}
	
	public int play(int player, int dealer) {
	int score = 0;
	/*	if (dealer < 16) {
			dealer = dealer + twist();
		}*/
	
		if ((player > 30 ||  dealer > 30) || (player < 4 || dealer < 4)){
			score = -1;
		} else if (player > 21 && dealer <= 21) {
			score = dealer;
		} else if (player > dealer && player <= 21) {
			score = player;
		} else if (dealer >= player && dealer <= 21) {
			score = dealer;
		}
		
		
		return score;
		
		
	}
	
	public int twist() {
		int card = (int) ((Math.random() * 11) + 1);
		return card;
	}
	
}
