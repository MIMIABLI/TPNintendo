package nintendo.test;

import java.time.LocalDate;


import nintendo.model.Achat;

import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		Boutique boutique = new Boutique("zara", "chatelet");

		Console c = new Console("ps4", 123, LocalDate.parse("2024-03-20"));
	

		Jeu jeu1 = new Jeu("titre1", c, boutique);
		Jeu jeu2 = new Jeu("titre2", c, boutique);
		Jeu jeu3 = new Jeu("titre3", c, boutique);
		Jeu jeu4 = new Jeu("titre4", c, boutique);
		Jeu jeu5 = new Jeu("titre5", c, boutique);
		
		Client client1 = new Client ("hajar", "bouamout");
		Client client2 = new Client ("hana","azid");
		
		Achat achat = new Achat(jeu1,null, 123.0);
		client1.getAchat().add(achat);
		
		
		

		
	}

}
