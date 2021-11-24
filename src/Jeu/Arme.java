package Jeu;

enum Type { épée, couteau, masse, pistolet, arc};

public class Arme {
	
	String nom;
	int puissance;
	Type type;
	
	
	public Arme(String nom, int puissance, Type type) {
		super();
		this.nom = nom;
		this.puissance = puissance;
		this.type = type;
	}


	@Override
	public String toString() {
		return nom + " sa puissance: " + puissance + " son type: " + type;
	}
	
	
	
}
