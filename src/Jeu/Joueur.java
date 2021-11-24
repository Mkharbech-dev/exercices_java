package Jeu;

import java.util.Random;

public class Joueur {
	Random random = new Random();
	
	String nom;
	int santé =10;
	int force = random.nextInt(4,11);
	int expérience =1;
	Type arme ;

	
	//Constructeur
	
	public Joueur(String nom) {
		super();
		this.nom = nom;
		
	}

	@Override
	public String toString() {
		return "Joueur: " + nom + ", santé: " + santé + ", force: " + force + ", expérience: "+ expérience ;
	}
	
	public void porterArme(Arme arme) {
		
		System.out.println("Joueur: " + nom + ", santé: " + santé + ", force: " + force + ", expérience: "+ expérience+" "+ arme);
	   }
	
	public void desarmer() {
		System.out.println("il ne porte  d'arme");
	   }
	
	public void changerArme(Arme arme) {
		System.out.println("il change son arme par: "+ arme);
	   }
 
	public void attaquer(Joueur joueur, Arme arme) {
		if(force*santé*expérience*arme.puissance >joueur.force*joueur.expérience*arme.puissance) {
			this.force++;
			joueur.santé--;
			this.expérience++;
			joueur.expérience++;
		}
	}
	
}
