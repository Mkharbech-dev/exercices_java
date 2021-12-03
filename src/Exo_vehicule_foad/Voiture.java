package Exo_vehicule_foad;

public class Voiture extends Vehicule {

	int cylindrée;
	int nbrPorte;
	int puissance;
	int kilométrage;
	//Constructeur
	public Voiture(String marque, int date, Double prix_achat, int cylindrée, int nbrPorte, int puissance,
			int kilométrage) {
		super(marque, date, prix_achat);
		this.cylindrée = cylindrée;
		this.nbrPorte = nbrPorte;
		this.puissance = puissance;
		this.kilométrage = kilométrage;
	}
	//Méthode to string
	public String afficher() {
		
		return toString() + " cylindrée: " + cylindrée + " nbrPorte: " + nbrPorte + " puissance: " + puissance+ " kilométrage: " + kilométrage;
	}
	public void calculerPrix(int annéeActuelle) {
		
		//Calculer la déffirence d'année entre date achet et date actuelle.
		int defereneAnnée = annéeActuelle - date_achat;
		
		//Calculer l'amortisement par année.
		double amortParAnnee = (prix_achat*0.02*defereneAnnée);
		
		//Calculer l'amortisement par tranche de kilométrage parcouru.
		double amortParTranche = prix_achat-(prix_achat * (kilométrage*0.05/10000));
		double prix_courant = prix_achat - (amortParAnnee+amortParTranche);
		
		//Codition par raport au modele de la voiture
		if(marque.contentEquals("Fiat")||marque.contentEquals("Renault")) {
			prix_courant= prix_courant-(prix_achat*0.1);
		}else if(marque.contentEquals("Ferrari")||marque.contentEquals("Porsche")) {
			prix_courant= prix_courant-(prix_achat*0.2);
		}
		
		//si le prix négatif avec le temps passé on le remet à 0.
		if(prix_courant<0) {
			prix_courant = 0;
		}
		
		//affichage du prix
		System.out.println(prix_courant);
	}
	
	
	
	
	
	
	
	
	

}
