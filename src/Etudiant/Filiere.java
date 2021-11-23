package Etudiant;

public class Filiere {
	private String code;
	private String libelle;
	//Guetter et setter
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	//Constructeur
	public Filiere(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return  libelle;
	}
	
	
}
