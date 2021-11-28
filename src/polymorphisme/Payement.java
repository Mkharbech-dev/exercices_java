package polymorphisme;

import java.util.ArrayList;

public class Payement {

	public static void main(String[] args) {
		
		
		Directeur ali = new Directeur("ali");
		Chef salah = new Chef("salah");
		Ouvrier mati = new Ouvrier("mati");
		
		ArrayList<Salarier> salaries = new ArrayList<>();
		salaries.add(mati);
		salaries.add(salah);
		salaries.add(ali);
		
		for(Salarier item: salaries) {
			item.afficherSalaire();
		}
		
		

	}

}
