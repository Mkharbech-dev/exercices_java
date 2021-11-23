package Abstract;

public class Carre extends Forme{
	private int coté;
	
	public Carre(int coté) {
		this.coté = coté;
	}
	
	@Override
	public void calculerSurface() {
		System.out.println("la surface du carré est "+ coté*coté);
	}

}
