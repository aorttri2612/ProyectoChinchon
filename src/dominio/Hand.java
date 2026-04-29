package dominio;

import java.util.ArrayList;

public class Hand {

	ArrayList<Rank> hand;

	public Hand(ArrayList<Rank> hand) {
		super();
		this.hand = hand;

	}

	public int SizeHand() {
		return hand.size();
	}

	public void AddCards(Rank card) {

		if (hand.size() <= 8) {
			hand.add(card);

		} else {
			System.out.println("mano esta llena");
		}

	}

	public void Discardcard(int numeroCarta) {

		hand.remove(numeroCarta);

	}

	public void ShowHand() {

		for (int i = 0; i < hand.size(); i++) {
			System.out.println(hand.get(i));

		}

	}

}
