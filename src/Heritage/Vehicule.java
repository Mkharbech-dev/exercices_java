package Heritage;

public abstract class Vehicule implements Pompe{
	// Les methodes:
	protected abstract int nbrRoue(); 
	protected abstract String typeCarburant(String type) ;
	protected abstract int vitesseMax(int vit);		 
}
