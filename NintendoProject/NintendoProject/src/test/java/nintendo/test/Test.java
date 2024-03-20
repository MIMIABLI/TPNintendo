package nintendo.test;

import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c = new Console("ps4");
		Jeu jeu1 = new Jeu("titre1", c);
		Jeu jeu2 = new Jeu("titre2", c);
		Jeu jeu3 = new Jeu("titre3", c);
		Jeu jeu4 = new Jeu("titre4", c);
		Jeu jeu5 = new Jeu("titre5", c);
	}

}
