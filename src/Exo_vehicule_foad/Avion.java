package Exo_vehicule_foad;

public class Avion extends Vehicule{
	String type;
	int nbrHVol;
	//Constructeur
	public Avion(String marque, int date, Double prix_achat, String type, int nbrHVol) {
		super(marque, date, prix_achat);
		this.type = type;
		this.nbrHVol = nbrHVol;
	}
	
	//M�thode to string
		public String afficher() {
			return toString() + " Type: " + type + " nbrheureVol: " + nbrHVol ;
		}
	
	public void calculerPrix(int ann�eActuelle) {
			//Calculer l'amortisement par tranche de heure du vol en cas de type r�action.
			double ammortParTrancheReaction = (prix_achat * (nbrHVol*0.1/1000));
			
			//Calculer l'amortisement par tranche de heure du vol en cas de type h�lices.
			double ammortParTrancheHelices = (prix_achat * (nbrHVol*0.1/100));
			
			//Condition calcul prix courant selon le type
			if(type.contentEquals("r�action")){
				prix_courant = prix_achat-ammortParTrancheReaction;
			}else if(type.contentEquals("h�lices")) {
				prix_courant= prix_achat-ammortParTrancheHelices;
			}
			//si le prix n�gatif avec le temps pass� on le remet � 0.
			if(prix_courant<0) {
				prix_courant = 0.0;
			}
			System.out.println(prix_courant);	
		}	
}
