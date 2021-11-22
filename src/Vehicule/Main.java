package Vehicule;

public class Main {

	public static void main(String[] args) {
		
		Voiture polo = new Voiture ("diesel", 150,100,50);
		System.out.println(polo);
		Moto honda = new Moto("essence", 120, 75,20); 
		System.out.println(honda);
		
		pompe Esso = new pompe("diesel", 500, 200);
//		pompe total = new pompe("essence", 300, 200);
		System.out.println("avant" + Esso);
		polo.faireLePlein( Esso);
		
		System.out.println("apres"+ Esso);

	}

}
