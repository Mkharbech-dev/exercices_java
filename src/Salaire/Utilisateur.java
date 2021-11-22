package Salaire;

public class Utilisateur extends Personnel {
	
	
	String login;
	String motPass;
	String service;
	Role role;
	
	public Utilisateur(String nom, String prenom, String email, String tel, Double salaire, Role role) {
		super(nom, prenom, email, tel, salaire);
		this.role= role;
	}
	
	

	public Utilisateur(String nom, String prenom, String email, String tel, Double salaire, String login, String motPass,
			String service, Role role) {
		super(nom, prenom, email, tel, salaire);
		this.login = login;
		this.motPass = motPass;
		this.service = service;
		this.role = role;
	}


	public String afficher() {
			return super.afficher()+ "  "+ role.getLibelle();
	 }
 
 	public double calculSal() {
 		if(this.role.getLibelle().equalsIgnoreCase("Directeur general")) {
 			return super.getSalaire() * 1.4;
 		}else if(this.role.getLibelle().equalsIgnoreCase("Manager")) {
 			return super.getSalaire() * 1.1;
 		}else {
 			return super.getSalaire();
 		}
 		
 	}
 
 
}
