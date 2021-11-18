package afpa;

import java.util.Scanner;

//import java.util.Scanner;

class MainBook {
	
	  private static Scanner titre;
	private static Scanner auteur;
	private static Scanner prix;

	public static void main(String[] args) {
		  
		  
//		 ******************Palindrome************************ 
//		System.out.println("saisir un mot");
//	  	Scanner salah = new Scanner(System.in);
//
//	    String str =salah.next();
//	    String reverseStr = "";
//	    
//	    int strLength = str.length();
//
//	    for (int i = (strLength - 1); i >=0; --i) {
//	      reverseStr = reverseStr + str.charAt(i);
//	      System.out.println(str.charAt(i));
//	    }
//	   
//
//	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
//	      System.out.println(str + " is a Palindrome String.");
//	    }
//	    else {
//	      System.out.println(str + " is not a Palindrome String.");
//	    }
//	    
//	    salah.close();
	    
//	    ****************************exercices livres*****************
		  // Demande à l'utilisateur de saisir le nbr de livre souhaité:
		
		  		System.out.println("saisir un nombre livre!");
		  	Scanner nbr = new Scanner(System.in);
		    int nombreLivre = nbr.nextInt();
		    
		    // Instanciation d'un tableau tabLivre de la classe BOOK en détérminat
		    // la taille au nombre saisi par l'utilisateur
		    Book [] tabLivre = new Book [nombreLivre];
		    //Je parcours mon tableau en consultants les user de le remplir
		    for( int i = 0 ; i < nombreLivre; i++) {
		    	
		    	titre = new Scanner(System.in);
		    	System.out.println("saisir le titre du livre "+ (i+1));
		    	String title = titre.nextLine();
		    	auteur = new Scanner(System.in);
		    	System.out.println("saisir l'auteur du livre "+ (i+1));
		    	String autor = auteur.nextLine();
		    	prix = new Scanner(System.in);
		    	System.out.println("saisir le prix du livre "+ (i+1));
		    	int price = prix.nextInt();
		    	// j'alimente mon tableau par les objets saisis par l'user
		    	tabLivre[i] = new Book (title,autor,price);
		    }
		    // Initialiser un total à zero
		    int total = 0;
		    
		    for ( int i =0; i< tabLivre.length ; i++) {
		    	System.out.println("le titre du livre "+(i+1)+" est " + tabLivre[i].getTitle()+
		    	" son auteur est "+tabLivre[i].getAutor()+ " et son prix est "+ tabLivre[i].getPrice() );
		    	total += tabLivre[i].getPrice();
		    }
		    System.out.println("le total des prix des livres est "+ total);
	    
	  }
	}