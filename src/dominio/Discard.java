package dominio;

import java.util.ArrayList;

public class Discard {

	// guardar la ultima carta del monton de descarte

	private ArrayList<Rank> discard;

	public Discard(ArrayList<Rank> discard) {
		super();
		this.setDiscard(discard);
	}

	public Rank getLastCard() {
		return getDiscard().get(getDiscard().size() - 1);
	}

	public void ShowCardDiscard() {

		System.out.println(getDiscard().size() - 1);

	}

	public Rank getRemoveCard() { // no se la añadimos a la mano pq eso se hace en el gestorGame
		// ahora solo la
		// quitamos de la pila

		getDiscard().remove(getDiscard().size() - 1);

		return getDiscard().get(0);
	}

	public ArrayList<Rank> getDiscard() {
		return discard;
	}

	public void setDiscard(ArrayList<Rank> discard) {
		this.discard = discard;
	}

}
