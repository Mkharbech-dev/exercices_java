package Abstract;

public class Cercle extends Forme{
	
	private int rayon;
	
	public Cercle(int rayon) {
		this.rayon = rayon;
	}
	@Override
	public void calculerSurface() {
		System.out.println("la surface du cercle est "+ Math.PI * rayon*rayon);
	}
}
