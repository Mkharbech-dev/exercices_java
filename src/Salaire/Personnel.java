package Salaire;

public class Personnel {
	int identifiant = 0;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private Double salaire;
	
	
	
	//constructeur
	public Personnel(String nom, String prenom, String email, String tel, Double salaire) {
		super();
		this.identifiant = identifiant++;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.salaire = salaire;
	}
	
	// methode afficher
	
	public String afficher() {
		return "identifiant :" + this.identifiant + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", tel=" + tel + ", salaire=" + salaire;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	public String CP() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Methode salaire
	public Double calculSalaire() {
		return salaire;
	}
	
}
