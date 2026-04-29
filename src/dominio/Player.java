package dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
	protected String name;
	protected Hand hand;
	protected int score;

	public Player(String name) {
		this.name = name;
		this.hand = new Hand(new ArrayList<>());
		this.score = 0;
	}

	public String getName() {
		return name;
	}

	public Hand getHand() {
		return hand;
	}

	public int getScore() {
		return score;
	}

	public void addPoints(int points) { // falta la lógica
		this.score += points;
	}
	
	public void close() { // metodo creado no terminado ni hecho

	}

	public abstract void playTurn(Discard discard, Deck deck, List<Rank> currentDeck, int count);
}