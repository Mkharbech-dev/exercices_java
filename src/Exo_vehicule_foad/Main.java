package Exo_vehicule_foad;

public class Main {

	public static void main(String[] args) {
		//Instanciation d'une voiture
		Voiture fiat = new Voiture("Ferrari",1990, 20000.00, 10, 4, 175, 180000);
		//afficher la voiture
		System.out.println(fiat.afficher());
		//Calculer le prix courant
		fiat.calculerPrix(2021);
		
		System.out.println("***********************************************");
		
		
		//Instanciation d'un avion hélices
		Avion boeing = new Avion("boeing", 2010, 2000000.00, "hélices", 900);
		//afficher l'avion
		System.out.println(boeing.afficher());
		//Calculer le prix courant
		boeing.calculerPrix(2021);
		
		System.out.println("***********************************************");
		
		
		//Instanciation d'un avion hélices
		Avion airbus = new Avion("airbus", 2010, 2000000.00, "réaction", 900);
		//afficher l'avion
		System.out.println(airbus.afficher());
		//Calculer le prix courant
		airbus.calculerPrix(2021);
	}
	
	
	
	
	
}
