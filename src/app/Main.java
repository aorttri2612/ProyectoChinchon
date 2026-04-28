package app;

public class Main {

	public static void main(String[] args) {
		// Usamos el Singleton
		ConsoleInput input = ConsoleInput.getInstance();
		GestorGame gestor = new GestorGame();

		System.out.println("=== CHINCHÓN JAVANÉS ===");
		System.out.print("¿Cuántos humanos jugarán? ");
		int humanos = input.readInt();
		
		System.out.print("¿Cuántas IAs jugarán? ");
		int ais = input.readInt();

		gestor.startGame(humanos, ais);
	}
}