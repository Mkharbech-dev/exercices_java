package ExoDao;

public class Etudiant {
	private int id;
	private String nom;
	private String prenom;
	//Constructeur sans param
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "id= " + id + ", nom= " + nom + ", prenom= " + prenom ;
	}
	//Constructeur avac nom et prénom
	public Etudiant(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}
	//Guetter et Setter
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
}
