package Heritage;

public class lapin extends Animal {
	
	public String bondi() {
		return identifier();
	}
	
	// Le mot super s'apparait car le nom de notre m�thode est identique � celle de notre classe m�re Animal.
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
