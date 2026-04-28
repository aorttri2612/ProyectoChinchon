package dominio;

import java.util.ArrayList;

public class Discard {

	// guardar la ultima carta del monton de descarte

	ArrayList<Rank> discard;

	public Discard(ArrayList<Rank> discard) {
		super();
		this.discard = discard;
	}

	public Rank getLastCard() {
		return discard.get(discard.size() - 1);
	}

	public void ShowCardDiscard() {

		System.out.println(discard.size() - 1);

	}

	public Rank getRemoveCard() { // no se la añadimos a la mano pq eso se hace en el gestorGame
		// ahora solo la
		// quitamos de la pila

		discard.remove(discard.size() - 1);

		return discard.get(0);
	}

}
