package Heritage;

public class Voiture extends Vehicule {
	int nbrRoue = 4;
		public Voiture(String typeCarb, int contenanceReservoir, int contenuReservoir) {
		super(typeCarb, contenanceReservoir, contenuReservoir);
		System.out.println("le vehicule à "+nbrRoue +" roues est "+ typeCarb +" sa vitesse maximale est de "+
		vitesseMax(280) +" km/h, sa capacite de reservoire est de "+contenanceReservoir+ " et contient "+contenuReservoir+" littres");
	}
}
