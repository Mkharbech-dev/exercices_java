package DAO;

public class Client {
	private String nom;
	private String prenom;
	private int id;
	//Constructeur avec id
	public Client(int id, String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	//Constructeur sans id
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	//Guetter et setter
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
