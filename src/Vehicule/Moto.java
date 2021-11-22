package Vehicule;

public class Moto extends Vehicule {
	
	final int ROUES = 2;
	
	public Moto() {
		super();
	}
	
	public Moto(String typeCarburant, int vMax, int contenance, int contenu) {
		super(typeCarburant, vMax, contenance, contenu);
	}

	@Override
	public String toString() {
		return "Moto [ROUES=" + ROUES + "]";
	}
	
	

}