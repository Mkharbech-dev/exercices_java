package Abstract;

public class Carre extends Forme{
	private int cot�;
	
	public Carre(int cot�) {
		this.cot� = cot�;
	}
	
	@Override
	public void calculerSurface() {
		System.out.println("la surface du carr� est "+ cot�*cot�);
	}

}
