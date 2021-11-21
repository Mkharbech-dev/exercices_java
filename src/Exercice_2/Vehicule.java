package Exercice_2;

public class Vehicule implements Pompe {
	//Mes variables de vehicule
	int contenanceReservoire;
	int contenuReservoir;
	String typeCarb;
	//Mes variables de station à pompe
	String typeCarburant;
	int contenance;
	int contenu;
	//Mes méthodes
	protected String typeCarb(String type) {
		return type;
	}
	protected int vitesseMax(int vit) {
		return vit;
	}
	//Les constructeurs
	public int fairePleine(int a, int b, int c, int d) {
		this.contenanceReservoire = a;
		this.contenuReservoir = b;
		this.contenance = c;
		this.contenu=d;
		return d-(a-b);
	}
	
	public Vehicule(String typeCarb,int contenanceReservoir, int contenuReservoir) {
		super();
		this.contenuReservoir = contenuReservoir;
		this.contenanceReservoire = contenanceReservoir;
		this.typeCarb = typeCarb;
	}
	// Methode de verification de station pompe
	public void verif() {
		if(typeCarb==typeCarburant) {
			System.out.println("vous pouvez passer à la station, a meme type de carburant que votre voiture,");
		}else {
			System.out.println("vous ne pouvez passer à la station, n'a pas meme type de carburant que votre voiture,");
		}
	}
	// Constructeur de notre fonction pompe()
	public void pompe(String typeCarburant, int contenance, int contenu) {
		System.out.println("et ma station de pompe est de type "+ typeCarburant+ " et sa capacité est de "+contenance+" et affiche dans son contenu "+
		contenu+" littres");
		this.contenu = contenu;
		this.typeCarburant = typeCarburant;
		this.contenance = contenance;
	};
}







