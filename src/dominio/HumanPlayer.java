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
			discardCard(input, discard);
		} else if (opcion == 3) {
			showSuggestion();
		}

		// Aquí iría la lógica de es decir falta aun:
		// 2. Mostrar sugerencia de descarte
	
	}

	public void steal(Discard discard) {
		hand.AddCards(discard.getRemoveCard());

	}

	public void stealDeck(Deck deck) {
		hand.AddCards(deck.takeCardFromDeck());

	}

	public void discardCard(ConsoleInput input, Discard discard) { //cambiado el metodo discardCard
        System.out.println("Introduce el índice de la carta a descartar (0-6):");
        int index = input.readInt();
        
        // Obtenemos la carta antes de borrarla para ponerla en la pila de descarte
        Rank toDiscard = hand.hand.get(index);
        hand.Discardcard(index); // Tu método de Hand que usa remove(int)
        discard.discard.add(toDiscard); // Se añade al ArrayList de la clase Discard
        
        System.out.println("Has descartado: " + toDiscard);
    }
	
	public void showSuggestion() {
        Rank suggestion = hand.hand.get(0);
        for (Rank r : hand.hand) {
            if (r.getCardValue().getValue() > suggestion.getCardValue().getValue()) {
                suggestion = r;
            }
        }
        System.out.println(" Sugerencia de la IA: Deberías descartar " + suggestion + 
                           " porque es tu carta de mayor valor.");
    }
	
}