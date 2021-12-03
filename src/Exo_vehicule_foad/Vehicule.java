package Exo_vehicule_foad;

public abstract class  Vehicule {
	
	String marque;
	int date_achat;
	Double prix_achat;
	Double prix_courant = 0.0;
	String annéeActuelle;
	
	//Constructeur avec param
	public Vehicule(String marque, int date, Double prix_achat) {
		super();
		this.marque = marque;
		this.date_achat = date;
		this.prix_achat = prix_achat;
	}
	//To string
	@Override
	public String toString() {
		return"Marque: "+ marque + " date d'achat: " + date_achat + " prix_achat: " + prix_achat;
	}
	//Fonction qui me permet de calculer le prix courant moins 1% pa année depuis date achat
	public void calculePrix(int annéeActuelle) {
		int ammortissement = annéeActuelle - date_achat;
		prix_courant =prix_achat- (prix_achat*0.01*ammortissement);
		System.out.println(prix_courant);
	}
}
