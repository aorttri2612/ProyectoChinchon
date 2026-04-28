package dominio;

import app.ConsoleInput;

public class HumanPlayer extends Player {

	public HumanPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playTurn(Discard discard, Deck deck) {
		ConsoleInput input = ConsoleInput.getInstance(); // creado en console input
		System.out.println("\n--- " + name + "'s turn ---");
		hand.ShowHand();
		System.out.println("Menú");
		System.out.println("¿Qué deseas Hacer?");
		System.out.println("1. Robar");
		System.out.println("2. Descartar");
		System.out.println("3. Si desea ayuda para elegir que descartar aqui sele mostrara una sugerencia");
		int opcion = input.readInt();
		if (opcion == 1) {
			int opcion2;
			System.out.println("¿Que deseas robar del mazo o del descarte?");
			opcion2 = input.readInt();
			if (opcion2 == 1) {
				steal(discard);

			} else if (opcion2 == 2) {
				stealDeck(deck);
			}
		} else if (opcion == 2) {
			discardCard(input);
		} else if (opcion == 3) {

		}

		// Aquí iría la lógica de es decir falta aun:
		// 1. Robar (Mazo o Descarte)
		// 2. Mostrar sugerencia de descarte
		// 3. Descartar
	}

	public void steal(Discard discard) {
		hand.AddCards(discard.getRemoveCard());

	}

	public void stealDeck(Deck deck) {
		hand.AddCards(deck.takeCardFromDeck());

	}

	public void discardCard(ConsoleInput input) {
		System.out.println("¿Que carta desea descartar?. Ponlo contando de izquierda a derecha "); // intenatr cambiar
																									// pero esto
																									// funciona
		int numeroCarta = input.readInt();
		numeroCarta = numeroCarta - 1;
		hand.ShowHand();
		hand.Discardcard(numeroCarta);

	}

	@Override
	public void playTurn() {
		// TODO Auto-generated method stub

	}
}