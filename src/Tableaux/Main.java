package Tableaux;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Instanciation d'un tableau
		
		int[] tab = new int[10];
		Scanner s = new Scanner (System.in);
		int valeurCherch�e;
		int compteur = 0;
		
		System.out.println("Entrer dix valeurs" );
				for(int i =0; i<tab.length; i++) {
					tab[i]=s.nextInt();
				}
				
		System.out.println("entrez la valeur que vous cherchez ");
		valeurCherch�e = s.nextInt(); 
		
		for(int i =0; i<tab.length; i++) {
			if(valeurCherch�e == tab[i]) {
				compteur++;
			}
				
		}
		
		if(compteur==0)
			System.out.println("la valeur cherch�e n'existe pas dans le tableau");
		else
			System.out.println("la valeur cherch�e existe "+compteur+" fois dans le tableau");
	}

}
