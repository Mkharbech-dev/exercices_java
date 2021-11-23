package Abstract;

public class Main {

	public static void main(String[] args) {
		Carre carre = new Carre(12);
		carre.calculerSurface();
		Cercle cercle = new Cercle(3);
		cercle.calculerSurface();
		//Abstract class est crée pour etre héritée, dont on ne peut pas creer des objets.(abstrait != concret)
	}
	
	
}
