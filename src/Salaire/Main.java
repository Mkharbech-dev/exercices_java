package Salaire;

import java.util.ArrayList;

import afpa.Book;

public class Main {

	public static void main(String[] args) {
		

		//3. Créer les rôles :
		Role cp = new Role("CP","Chef de projet");
		Role MN = new Role("MN","Manager");
		Role DP = new Role("DP","Directeur de projet");
		Role DRH = new Role("DRH","Directeur  de ressource");
		Role DG = new Role("DG","Directeur general");
		
		
		Utilisateur malak = new Utilisateur("malak", "ennacicri", "malak@hotmail.fr", "0678787878", (double) 3000, DP);
		System.out.println(malak.afficher());
		System.out.println(malak.calculSal());

		Utilisateur salah = new Utilisateur("malak", "ennacicri", "malak@hotmail.fr", "0678787878", (double) 5000, MN);
		System.out.println(salah.afficher());
		System.out.println(salah.calculSal());

		Utilisateur imane = new Utilisateur("malak", "ennacicri", "malak@hotmail.fr", "0678787878", (double) 7000, cp);
		System.out.println(imane.afficher());
		System.out.println(imane.calculSal());

		Utilisateur sara = new Utilisateur("malak", "ennacicri", "malak@hotmail.fr", "0678787878", (double) 8500, DRH);
		System.out.println(sara.afficher());
		System.out.println(sara.calculSal());

		Utilisateur bouchra = new Utilisateur("malak", "ennacicri", "malak@hotmail.fr", "0678787878", (double) 12000, DG);
		System.out.println(bouchra.afficher());
		System.out.println(bouchra.calculSal());
	}

}
