package EmplyeeCrud;

public class Employee {
	private int code;
	private String nom;
	private int salaire;
	//Constructeur
	public Employee(int code, String nom, int salaire) {
		this.code = code;
		this.nom = nom;
		this.salaire = salaire;
	}
	
	//guetter et settrer
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return code + " " + nom + " " +salaire;
	}
	
}
