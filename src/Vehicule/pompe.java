package Vehicule;

public class pompe {
	private String typeCarburant;
	private int contenance;
	private int contenu;
	
	public pompe(String typeCarburant, int contenance, int contenu) {
		super();
		this.typeCarburant = typeCarburant;
		this.contenance = contenance;
		this.contenu = contenu;
	}
	
	public pompe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTypeCarburant() {
		return typeCarburant;
	}
	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}
	public int getContenance() {
		return contenance;
	}
	public void setContenance(int contenance) {
		this.contenance = contenance;
	}
	public int getContenu() {
		return contenu;
	}
	public void setContenu(int contenu) {
		this.contenu = contenu;
	}

	@Override
	public String toString() {
		return "pompe [typeCarburant=" + typeCarburant + ", contenance=" + contenance + ", contenu=" + contenu + "]";
	}
	
	
}
