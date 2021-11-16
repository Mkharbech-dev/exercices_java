package afpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
	
	public static void main(String[] args) {
//		System.out.println("couocu");
//		String machin = "salut";
//		System.out.println(machin);
//		char test = 'A';
//		System.out.println(test);
//		double nombre2 = 99.9;
//		System.out.println(nombre2);
//		long nombre3 =5454545;
//		System.out.println(nombre3);
//		boolean condition = false;
//		System.out.println(condition);
//		/*LES CONSTANTES*/
////		personne afpa = new Personne("dddd","hhhh");
//		/*LES CONSTANTES*/
//		final int AFPA =15;
//		System.out.println(AFPA);
////		Les tableaux type int ou string
//		int tab [] = {1,2,3,4,5};
//		
//		for (int j = 0; j < tab.length; j++) {
//			System.out.println("les elements:" + tab[j]);
//		}
//		
//		for (int i : tab) {
//			System.out.println("les elements:" + i);
//		}
//		
////		les collections
//		
//		ArrayList<String> coll = new ArrayList<>();
//		coll.add("salah");
//		coll.add("malak");
////		combien y a t'il de données dans la collection
//		 
//		System.out.println("le premier elment de ma collection est: " + coll.get(0));
//		System.out.println("la langueure du tableau (collection) coll est "+coll.size());
//		
////		tableaux 2 dimentions
//		int [][] echiquier = {
//				{1,2,3,4,},{5,6,7,8}
//		};
//		 for (int i = 0; i < echiquier.length; i++) {
//			for (int j = 0; j < echiquier[i].length; j++) {
//				System.out.println("l' éléments numéro " + j + " de mon tableau "+ i +" à deux dimensions sont: "+echiquier[i][j]);
//			}
//		}
//		 
//		 System.out.println(echiquier.length);
//		**************************//Exercice tableau de semaine	*******************************
		 
		ArrayList <String> semaine = new ArrayList<>();
		semaine.add("lundi");
		semaine.add("mar");
		semaine.add("mercredi");
		semaine.add("jeudi");
		semaine.add("vendredi");
		semaine.add("samedi");
		semaine.add("dimanc");
		// supprission de dernier element de tablaeau
		semaine.remove(semaine.size() - 1);
		// ffichage apres supprission
		System.out.println(semaine);
		// ajouter dimanche************************
		semaine.add("dimanche");
		System.out.println(semaine);
//		********remplacer mar par mardi**********
		semaine.set(semaine.indexOf("mar"), "mardi");
		System.out.println(semaine);
//		*******la taille du tableu**************
		System.out.println(semaine.size());
//		*******get 5 eme valeur**********************
		System.out.println(semaine.get(4));
//		**************************//Exercice nombre est premier ou pas:	*******************************
		
			
		  int reste;
		  boolean estPremeir = true;
		  int nbr = 18;
		        
		  for(int i=2; i <= nbr/2; i++)
		  {
		     //nombre est divisible par lui-meme
		     reste = nbr%i;
		            
		     //si le reste est 0, alors arrete la boucle. Sinon continuer la boucle
		     if(reste == 0)
		     {
		    	 estPremeir = false;
		        break;
		     }
		  }
		  //si flag est true, alors nombre est premier, sinon non premier
		  if(estPremeir)
		     System.out.println(nbr + " est un nombre premier");
		  else
		     System.out.println(nbr + " n'est pas un nombre premier");

//		*****************************//Exercice nombre est premier ou pas:	2eme version********************************
		  
		  int nbre = 1;
		  boolean premier = true;
		  
		  for (int i = 2 ; i< nbre; i++) {
			 if(nbre % i == 0) {
				 System.out.println(nbre+ " n'est pas premier car est divisible par "+i);
				 premier = false;
				 break;
			 }
			 }
			 
		  if(premier){
				 System.out.println(nbre +" est premier");
			 }
		  
//		  ************************//Exercice année est bissextille ou pas:	**************
	
		  	
		  	int y = 2005;
	        if((y % 4 == 0 && y % 100 > 0) || (y % 400 == 0)) {
	        	System.out.println("L'année "+ y +" est une année bissextile");
	        }else {
	        	System.out.println("L'année "+ y +" n'est pas une année bissextile");
	        }
	        
	       
       //	**************************************************************
	        
		  	System.out.println("saisir un nombre");
		  	Scanner salah = new Scanner(System.in);
		  	int choix = salah.nextInt();
		  	System.out.println("voici ton choix : "+ choix);
	
			
	    	
	    	
	    	
	    	
	}

}

