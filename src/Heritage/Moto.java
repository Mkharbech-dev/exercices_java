package Heritage;

public class Moto extends Vehicule {
	int nbrRoue = 2;
		public Moto(String typeCarb, int contenanceReservoir, int contenuReservoir) {
		super(typeCarb, contenanceReservoir, contenuReservoir);
		System.out.println("le vehicule à "+nbrRoue +" roues est "+ typeCarb +" sa vitesse maximale est de "+
		vitesseMax(280) +" km/h, sa capacite de reservoire est de "+contenanceReservoir+ " et contient "+contenuReservoir+" littres");
	}
}