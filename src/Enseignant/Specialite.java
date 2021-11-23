package Enseignant;

public class Specialite {
	
	private String code;
	private String libelle;
	//Constructeur
	public Specialite(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	//Guettre et setter
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
	//toString
	@Override
	public String toString() {
		return "Specialite [code=" + code + ", libelle=" + libelle + "]";
	}
	
}
