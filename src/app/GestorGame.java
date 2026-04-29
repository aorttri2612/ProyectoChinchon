package app;

import java.util.ArrayList;
import java.util.List;

import dominio.Deck;
import dominio.Discard;
import dominio.Player;
import dominio.Rank;

public class GestorGame {
	private List<Player> players;
	private Discard discard;
	private List<Rank> currentDeck;
	private int count = 0;

	public void startGame(int humans, int ais) {
		players = new ArrayList<>();
		for (int i = 0; i < humans; i++)
			players.add(new BuilderPlayer().setName("H" + (i + 1)).setIsAi(false).build());
		for (int i = 0; i < ais; i++)
			players.add(new BuilderPlayer().setName("IA" + (i + 1)).setIsAi(true).build());

		currentDeck = Deck.createDeck(players.size());
		discard = new Discard(new ArrayList<>());

		// Repartir 7 iniciales
		for (Player p : players) {
			for (int j = 0; j < 7; j++) {
				p.getHand().AddCards(currentDeck.remove(currentDeck.size() - 1));
			}
		}

		// Primera carta al descarte
		discard.getDiscard().add(currentDeck.remove(currentDeck.size() - 1));

		// Bucle de juego
		while (true) {
			for (Player p : players) {
				// Pasamos el objeto Deck y Discard
				p.playTurn(discard, new Deck(), currentDeck, count);
				count++;
			}
		}
	}
}