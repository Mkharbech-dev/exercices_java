package Vehicule;

public class Vehicule {
	private String typeCarburant;
	private int contenanceRes;
	private int contenuRes;
	private int vMax;
	
	//constructeurs sans et avec parametres:
	
	public Vehicule() {
		super();	
	}
	
	public Vehicule(String typeCarburant, int contenanceRes, int contenuRes, int vMax) {
		super();
		this.typeCarburant = typeCarburant;
		this.contenanceRes = contenanceRes;
		this.contenuRes = contenuRes;
		this.vMax = vMax;
	}

	//Faire le plein
	
	public void faireLePlein(pompe pompe) {
		int besoinCarburant = this.contenanceRes - this.contenuRes;
		System.out.println("votre besoin du carburant est "+ besoinCarburant);
		
		if(besoinCarburant > pompe.getContenu()) {
			besoinCarburant = pompe.getContenu();
			
		}
		
		System.out.println("faire le plein en ajoutant");
		this.contenuRes += besoinCarburant;
		int nouveauContenuALapompe = pompe.getContenu() - besoinCarburant;
		
		pompe.setContenu(nouveauContenuALapompe);
	}
		
		
}
