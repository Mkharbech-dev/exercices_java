package Heritage;

public class lapin extends Animal {
	
	public String bondi() {
		return identifier();
	}
	
	// Le mot super s'apparait car le nom de notre méthode est identique à celle de notre classe mére Animal.
//	public String identifier() {
//		return "je suis lapin ";
//	}

	@Override
	protected String dormir() {
		// TODO Auto-generated method stub
		return "je dors peu";
	}

	@Override
	protected String manger() {
		// TODO Auto-generated method stub
		return "je mange peu, ";
	}
	
	
}
