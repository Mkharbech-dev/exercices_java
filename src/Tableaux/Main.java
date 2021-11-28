package Tableaux;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Instanciation d'un tableau
		
		int[] tab = new int[10];
		Scanner s = new Scanner (System.in);
		int valeurCherchée;
		int compteur = 0;
		
		System.out.println("Entrer dix valeurs" );
				for(int i =0; i<tab.length; i++) {
					tab[i]=s.nextInt();
				}
				
		System.out.println("entrez la valeur que vous cherchez ");
		valeurCherchée = s.nextInt(); 
		
		for(int i =0; i<tab.length; i++) {
			if(valeurCherchée == tab[i]) {
				compteur++;
			}
				
		}
		
		if(compteur==0)
			System.out.println("la valeur cherchée n'existe pas dans le tableau");
		else
			System.out.println("la valeur cherchée existe "+compteur+" fois dans le tableau");
	}

}
