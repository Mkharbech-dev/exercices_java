package afpa;

public class Personne {
	
	
//	public Personne() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
	public Personne(String nom, String prenom) {
		super();
		this.setNom(nom);
		this.setPrenom(prenom);
	}

	// Les attributs
	private String nom ;
	private String prenom;
	// Les méthodes
	public void manger() {
		System.out.println("je mange du chocolat");
	}
	@Override
	public String toString() {
		return "le nom est: " + getNom() + " et le prenom est: " + getPrenom() ;
	}

	// GETTER ET SETTER get: acceder à l'attribut et set pour le modifier.
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
	
	 // tant que getNom est private donc je peux l'acceder au sein de la classe meme.
	public static void main(String[] args){
		 Personne cda = new Personne("mkharbech", "salah");
		 System.out.println(cda.getNom());
	}
	
	public int addition(int nombre, int nombre1) {
		return (nombre + nombre1);
	}
	
}
