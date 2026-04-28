package app;

import dominio.AiPlayer;
import dominio.HumanPlayer;
import dominio.Player; //crea jugadores pero esta sujeto a cambios

public class BuilderPlayer {
	private String name;
	private boolean isAi;

	public BuilderPlayer setName(String name) {
		this.name = name;
		return this;
	}

	public BuilderPlayer setIsAi(boolean isAi) {
		this.isAi = isAi;
		return this;
	}

	public Player build() {
		if (isAi) {
			return new AiPlayer(name);
		} else {
			return new HumanPlayer(name);
		}
	}
}