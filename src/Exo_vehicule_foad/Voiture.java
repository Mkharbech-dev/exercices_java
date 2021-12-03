package Exo_vehicule_foad;

public class Voiture extends Vehicule {

	int cylindr�e;
	int nbrPorte;
	int puissance;
	int kilom�trage;
	//Constructeur
	public Voiture(String marque, int date, Double prix_achat, int cylindr�e, int nbrPorte, int puissance,
			int kilom�trage) {
		super(marque, date, prix_achat);
		this.cylindr�e = cylindr�e;
		this.nbrPorte = nbrPorte;
		this.puissance = puissance;
		this.kilom�trage = kilom�trage;
	}
	//M�thode to string
	public String afficher() {
		
		return toString() + " cylindr�e: " + cylindr�e + " nbrPorte: " + nbrPorte + " puissance: " + puissance+ " kilom�trage: " + kilom�trage;
	}
	public void calculerPrix(int ann�eActuelle) {
		
		//Calculer la d�ffirence d'ann�e entre date achet et date actuelle.
		int defereneAnn�e = ann�eActuelle - date_achat;
		
		//Calculer l'amortisement par ann�e.
		double amortParAnnee = (prix_achat*0.02*defereneAnn�e);
		
		//Calculer l'amortisement par tranche de kilom�trage parcouru.
		double amortParTranche = prix_achat-(prix_achat * (kilom�trage*0.05/10000));
		double prix_courant = prix_achat - (amortParAnnee+amortParTranche);
		
		//Codition par raport au modele de la voiture
		if(marque.contentEquals("Fiat")||marque.contentEquals("Renault")) {
			prix_courant= prix_courant-(prix_achat*0.1);
		}else if(marque.contentEquals("Ferrari")||marque.contentEquals("Porsche")) {
			prix_courant= prix_courant-(prix_achat*0.2);
		}
		
		//si le prix n�gatif avec le temps pass� on le remet � 0.
		if(prix_courant<0) {
			prix_courant = 0;
		}
		
		//affichage du prix
		System.out.println(prix_courant);
	}
	
	
	
	
	
	
	
	
	

}
