package Etudiant;

public class Etudiant {
	private String nom;
	private String prenom;
	private Filiere filiere;
//	Consructeur
	
	public Etudiant(String nom, String prenom, Filiere filiere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
	}
//  Guetter et setter
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	@Override
	public String toString() {
		return nom + "   " + prenom + "    " + filiere ;
	}
	
	
}
