package afpa;

public class Expiration
{
	//Getter : access a un attribut
	// Setter : modifier un attribut
	
	public Expiration(int anneeExpiration) {
		this.anneeExpiration = anneeExpiration;
		System.out.println("enregistrement du produit, valide jusq'au "+ this.anneeExpiration);
	}
	
	private int anneeExpiration;
	
	public int getAnneeExpiration() {
		return this.anneeExpiration;
	}
	
	public void setAnneeExpiration(int machin) {
		this.anneeExpiration = machin;
	}
//	************************affichage****************************************************
	public static void main(String[] args) {
		
		 Expiration sr = new Expiration(2020);
		  sr.setAnneeExpiration(2050);
		  System.out.println(sr.getAnneeExpiration());
		  
		  sr.setAnneeExpiration(1981);
		  System.out.println(sr.getAnneeExpiration());
		
	}
	
}
