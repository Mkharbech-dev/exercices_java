package Jeu;

import java.util.Random;

public class Joueur {
	Random random = new Random();
	
	String nom;
	int sant� =10;
	int force = random.nextInt(4,11);
	int exp�rience =1;
	Type arme ;

	
	//Constructeur
	
	public Joueur(String nom) {
		super();
		this.nom = nom;
		
	}

	@Override
	public String toString() {
		return "Joueur: " + nom + ", sant�: " + sant� + ", force: " + force + ", exp�rience: "+ exp�rience ;
	}
	
	public void porterArme(Arme arme) {
		
		System.out.println("Joueur: " + nom + ", sant�: " + sant� + ", force: " + force + ", exp�rience: "+ exp�rience+" "+ arme);
	   }
	
	public void desarmer() {
		System.out.println("il ne porte  d'arme");
	   }
	
	public void changerArme(Arme arme) {
		System.out.println("il change son arme par: "+ arme);
	   }
 
	public void attaquer(Joueur joueur, Arme arme) {
		if(force*sant�*exp�rience*arme.puissance >joueur.force*joueur.exp�rience*arme.puissance) {
			this.force++;
			joueur.sant�--;
			this.exp�rience++;
			joueur.exp�rience++;
		}
	}
	
}
