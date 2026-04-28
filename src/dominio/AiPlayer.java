package dominio;

public class AiPlayer extends Player { // solo planteado

	public AiPlayer(String name) {
		super(name);
	}

	@Override
	public void playTurn() {
		// Lógica automática:
		// La IA evalúa si le conviene robar del mazo o del descarte
		// y calcula qué carta descartar para minimizar puntos.
		System.out.printf("AI %s is thinking...", name);
	}
}