package Heritage;

public class MainVehicule {

	public static void main(String[] args) {
		// Instanciation d'une voiture
		Voiture audi = new Voiture("diesel",20,10);
		audi.pompe("essence", 100,50);
		audi.verif();
		System.out.println( "apres avoir passé à la station pour faire le plein son contenu a changé  à " +
		audi.fairePleine(audi.contenanceReservoire,audi.contenuReservoir, audi.contenance,audi.contenu));					
		
		// Instanciation d'une moto
		
		Moto yamaha = new Moto("essence",33,10);
		yamaha.pompe("essence", 100,66);
		yamaha.verif();
		System.out.println( "apres avoir passé à la station pour faire le plein son contenu a changé  à " +
		yamaha.fairePleine(yamaha.contenanceReservoire,yamaha.contenuReservoir, yamaha.contenance,yamaha.contenu));
		

	}
}
