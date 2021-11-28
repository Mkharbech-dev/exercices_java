package Enseignant;

public class Enseignant {
		private String nom;
		private String prenom;
		private String email;
		private Specialite specialite;
		//Constructeur:
		public Enseignant(String nom, String prenom, String email, Specialite specialite) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.specialite = specialite;
		}
		//Guetter et Setter:
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
		public Specialite getSpecialite() {
			return specialite;
		}
		public void setSpecialite(Specialite specialite) {
			this.specialite = specialite;
		}
		//toString
		@Override
		public String toString() {
			return  nom + "    " + prenom + "    " + email + "    " + specialite.getLibelle();
		}
				
}
