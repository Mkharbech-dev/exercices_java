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
//		malak.identifiant = malak.identifiant+1;
//		System.out.println(malak);

		Utilisateur salah = new Utilisateur("salah", "ennacicri", "malak@hotmail.fr", "0678787878", (double) 5000, MN);
		System.out.println(salah.afficher());
		System.out.println(salah.calculSal());
//		System.out.println(salah.identifiant++);

		Utilisateur imane = new Utilisateur("imane", "ennacicri", "malak@hotmail.fr", "0678787878", (double) 7000, cp);
		System.out.println(imane.afficher());
		System.out.println(imane.calculSal());

		Utilisateur sara = new Utilisateur("imane", "ennacicri", "malak@hotmail.fr", "0678787878", (double) 8500, DRH);
		System.out.println(sara.afficher());
		System.out.println(sara.calculSal());

		Utilisateur bouchra = new Utilisateur("bouchra", "ennacicri", "malak@hotmail.fr", "0678787878", (double) 12000, DG);
		System.out.println(bouchra.afficher());
		System.out.println(bouchra.calculSal());
		
		Utilisateur yamna = new Utilisateur("yamna", "ennacicri", "malak@hotmail.fr", "0678787878", (double) 12000, MN);
		System.out.println(yamna.afficher());
		// Salaire apres modification
		System.out.println(yamna.calculSal());
		// Intiation d'un tableau de type Utilisateur
		ArrayList<Utilisateur> listUser = new ArrayList<Utilisateur>() ;
		//Alimenter notre tableau
		listUser.add(salah);
		listUser.add(bouchra);
		listUser.add(imane);
		listUser.add(malak);
		listUser.add(sara);
		listUser.add(yamna);
		System.out.println(listUser);
		// Parcourir le tableau en incrementant l'identifiant
		System.out.println("la liste des utilisateurs :");
		for (int i=0; i < listUser.size(); i++) {
			listUser.get(i).identifiant = i+1;
			System.out.println(listUser.get(i));
	    }
		System.out.println("la liste des managers : ");
		for (int i=0; i < listUser.size(); i++) {
			listUser.get(i).identifiant = i+1;
			if(listUser.get(i).role.getLibelle().equalsIgnoreCase("manager")) {
				System.out.println(listUser.get(i));
			}
			
	    }
	}
	
		
		

}
