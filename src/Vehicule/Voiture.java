package Vehicule;

public class Voiture extends Vehicule {
	
	final int ROUES = 4;
	
	public Voiture() {
		super();
	}
	
	public Voiture(String typeCarburant, int vMax, int contenance , int contenu) {
		super(typeCarburant, vMax, contenance, contenu);
	}

	@Override
	public String toString() {
		return "Voiture [ROUES=" + ROUES + "]";
	}
	
	
}
