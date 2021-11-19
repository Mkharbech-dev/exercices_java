package Heritage;

public class Voiture extends Vehicule implements Pompe {
	
	int contenanceReservoire;
	int contenuReservoir;
	String typeCarb;
	
	String typeCarburant;
	int contenance;
	int contenu;
	
	public int fairePleine(int a, int b, int c, int d) {
		this.contenanceReservoire = a;
		this.contenuReservoir = b;
		this.contenance = c;
		this.contenu=d;
		return d-(a-b);
	}
	
	public Voiture(String typeCarb,int contenanceReservoir, int contenuReservoir) {
		super();
		System.out.println("le vehicule à "+nbrRoue() +" roues est "+ typeCarb +" sa vitesse maximale est de "+
					vitesseMax(280) +" km/h, sa capacite de reservoire est de "+contenanceReservoir+ " et contient "+contenuReservoir+" littres");
		
		this.contenuReservoir = contenuReservoir;
		this.contenanceReservoire = contenanceReservoir;
		this.typeCarb = typeCarb;
	}
	
	public void verif() {
		if(typeCarb==typeCarburant) {
			System.out.println("vous pouvez passer à la station, a meme type de carburant que votre voiture,");
		}else {
			System.out.println("vous ne pouvez passer à la station, n'a pas meme type de carburant que votre voiture,");
		}
	}

	@Override
	protected int nbrRoue() {
		return 4;
	}

	@Override
	protected String typeCarburant(String type) {
		return type;
	}

	@Override
	protected int vitesseMax(int vit) {
		return vit;
	}

	@Override
	public String toString() {
		return "Voiture à " + nbrRoue() + " roues," ;
	}
	
	
	@Override
	public void pompe(String typeCarburant, int contenance, int contenu) {
		// TODO Auto-generated method stub
		System.out.println("et ma station de pompe est de type "+ typeCarburant+ " et sa capacité est de "+contenance+" et affiche dans son contenu "+
		contenu+" littres");
		
		this.contenu = contenu;
		this.typeCarburant = typeCarburant;
		this.contenance = contenance;
	};
	
	
}
