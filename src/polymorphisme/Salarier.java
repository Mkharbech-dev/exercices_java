package polymorphisme;

public class Salarier {
	String nom;
	Double salaire;
	public Salarier(String nom) {
		super();
		this.nom = nom;
	}
	@Override
	public String toString() {
		return  nom ;
	}
	
	public void afficherSalaire() {
		System.out.println("Le salaire de "+this+" est "+ salaire);
	}
}
