package Jeu_ciseaux_pierre_papier;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int joueur1, joueur2;
		int compJoueur1 = 0;
		int compJoueur2 = 0;
		
		//initialiser un tableau avec les choix
		String [] choix = {"Papier","Pierre","Ciseaux"};
		//affichage pour aider le joueur
		System.out.println("0 pour Papier");
		System.out.println("1 pour Pierre");
		System.out.println("2 pour Ciseaux");
		// faire tant que le nombre de rond inferieur à 3
		
			while(compJoueur1 < 3 && compJoueur2 <3) {
				// stocker le saisi de jaque joueur
				joueur1 = scanner.nextInt();
				joueur2 = random.nextInt(3);
				// encadrer le joueur pour respecter le saisi de ton choix
				while(joueur1<0 || joueur1>2) {
					System.out.println("saisir un choix valide: 0, 1, 2 ");
					joueur1 = scanner.nextInt();
					}
				System.out.println("le joueur 1 a choisi "+ choix[joueur1]
						+" et le joueur 2 a choisi "+choix[joueur2]);
				//Test
				if(joueur1 == 0 && joueur2 == 1 || joueur1 == 1 && joueur2 == 2
						|| joueur1 == 2 && joueur2 == 0) {
					compJoueur1++;
					System.out.println(compJoueur1 +"/"+ compJoueur2);
				}else if(joueur2 == 0 && joueur1 == 1 || joueur2 == 1 && joueur1 == 2
						|| joueur2 == 2 && joueur1 == 0 ) {
					compJoueur2++;
					System.out.println(compJoueur1+"/"+compJoueur2);
				}else {
					System.out.println("Egalité");
					System.out.println(compJoueur1+"/"+compJoueur2);
				}
			}
			
			if(compJoueur1 == 3)
				System.out.println("joueur 1 a gagné le match ");
			if(compJoueur2 == 3)
				System.out.println("joueur 2 a gagné le match ");
	}

}
