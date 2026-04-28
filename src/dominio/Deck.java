package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	static List<Rank> deck = new ArrayList<>();

	/**
	 * Crea una instancia de Rank uniendo los dos enums.
	 */
	public static Rank createRank(Card value, Suit suit) {
		return new Rank(value, suit);
	}

	/**
	 * Genera el mazo de cartas según el número de jugadores. Si hay más de 5
	 * jugadores, utiliza dos barajas automáticamente. Aunque quiero cambiarlo para
	 * que inicialize 2 barajas
	 */
	public static List<Rank> createDeck(int numberOfPlayers) {

		// Determinamos cuántas barajas necesitamos (1 o 2)
		int decksNeeded = (numberOfPlayers > 5) ? 2 : 1;

		for (int i = 0; i < decksNeeded; i++) {
			for (Suit suit : Suit.values()) {
				for (Card value : Card.values()) {
					deck.add(new Rank(value, suit));
				}
			}
		}

		// Mezclamos el mazo antes de devolverlo
		Collections.shuffle(deck);
		return deck;
	}

	public Rank takeCardFromDeck() {
		deck.remove(deck.size() - 1);
		return deck.get(0);
	}
}