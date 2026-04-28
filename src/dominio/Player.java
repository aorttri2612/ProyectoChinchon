package dominio;

import java.util.ArrayList;

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

	// Método abstracto para que cada tipo de jugador decida cómo jugar su turno
	public abstract void playTurn();

	public void playTurn(Discard discard, Deck deck) {
		// TODO Auto-generated method stub

	}
}