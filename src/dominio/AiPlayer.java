package dominio;

public class AiPlayer extends Player {

	public AiPlayer(String name) {
		super(name);
	}

	@Override
	public void playTurn(Discard discard, Deck deck) {
		System.out.printf("\n--- TURNO IA: %s ---\n", name);

		// 1. Robo automático
		if (discard.getLastCard().getCardValue().getValue() <= 4) {
			steal(discard);
			System.out.printf("%s robó del descarte.\n", name);
		} else {
			stealDeck(deck);
			System.out.printf("%s robó del mazo.\n", name);
		}

		// 2. Descarte automático (la más alta)
		int highestIdx = 0;
		for (int i = 1; i < hand.hand.size(); i++) {
			if (hand.hand.get(i).getCardValue().getValue() > hand.hand.get(highestIdx).getCardValue().getValue()) {
				highestIdx = i;
			}
		}

		Rank toDiscard = hand.hand.get(highestIdx);
		hand.Discardcard(highestIdx);
		discard.getDiscard().add(toDiscard);
		System.out.printf("%s descartó: %s\n", name, toDiscard);
	}

	public void steal(Discard discard) {
		hand.AddCards(discard.getRemoveCard());
	}

	public void stealDeck(Deck deck) {
		hand.AddCards(deck.takeCardFromDeck());
	}
}