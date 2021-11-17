package afpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Les attributs
	
		private String titre ;
		private String auteur;
		private int prix ;
	
	// CONSTRUCTEUR
//		public Livre(String titre, String auteur, int prix) {
//		super();
//		this.titre = titre;
//		this.auteur = auteur;
//		this.prix = prix;
//	}
		
		



	public Livre() {
		System.out.println("saisir un titre");
	  	Scanner title = new Scanner(System.in);
	    String titre = title.nextLine();
	    this.titre = titre;
	    System.out.println("saisir un auteur");
	  	Scanner aut = new Scanner(System.in);
	    String auteur = aut.next();
	    this.auteur = auteur;
	    System.out.println("saisir un prix");
	  	Scanner price = new Scanner(System.in);
	    int prix = price.nextInt();
	    this.prix = prix;
	    price.close();
	    aut.close();
	    title.close();
	    }
	
		//Méthode to string()
		@Override
	public String toString() {
		return "Le titre du livre est : " + titre + " et son auteur est " + auteur + " et son prix est " + prix + " €" ;
	}


	//  GETTER ET SETTER
		
		public String getTitre() {
			return titre;
		}



		public void setTitre(String titre) {
			this.titre = titre;
		}



		public String getAuteur() {
			return auteur;
		}



		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}



		public int getPrix() {
			return prix;
		}



		public void setPrix(int prix) {
			this.prix = prix;
		}
		
		
		
	}
		


