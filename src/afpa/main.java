package afpa;

import java.util.ArrayList;
import java.util.Scanner;

//import java.util.Scanner;
//********************************exercice Palindrome*******************************
class main {
//	
	  public static void main(String[] args) {
//		  
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
//	      //System.out.println(str.charAt(i));
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
//	  }
//	  
//	  	*********************************autre version*************************************
//	  	
//	  	Scanner scan = new Scanner(System.in);
//        System.out.println("saisissez un mot");
//        String mot = scan.next().toLowerCase();
//        StringBuilder motInverse = new StringBuilder();
//        motInverse.append(mot);
//        motInverse.reverse();
//        String reponse = motInverse.toString();
//        System.out.println(motInverse);
//                if (mot.equals(reponse)) {
//                    System.out.println(mot+" est un palindrome");
//
//                } else {
//                    System.out.println(mot+" n'est pas un palindrome");
//           
//                }
//                scan.close();
//	  	
	  	
//	  	*********************************autre facon*********************************
	  
//  	    
//  	    {
//  	        Scanner scanner = new Scanner( System.in );
//  	        System.out.println( "Veuillez saisir un palindrome : " );
//  	        String str = (scanner.nextLine()).toLowerCase() ;
//  	        if(str.equals(new StringBuilder(str).reverse().toString())) {
//  	            System.out.println(str + " est un palindrome !");
//  	        }
//  	        else {
//  	            System.out.println(str + " n'est pas un palindrome !" );
//
//  	    }
//  	    scanner.close();
//  	    
//  	    **********************instnciation de personne**************************************
  	    
  	  
// 	     Personne cda = new Personne("mkharbech", "salah");
// 	     // Modifier les valeurs de nom et prénom
// 	     cda.setNom("camara");
// 	     
// 	     System.out.println(cda);
// 	     System.out.println(cda.getNom());
// 	     System.out.println(cda.getPrenom());
// 	     cda.manger();
// 	     
// 	     System.out.println(cda.addition(50,30));
 	     
		  Livre livre = new Livre();
		  System.out.println(livre);
//		  *********************************************************
		  int count = 0;
		  System.out.println("saisir un nombre");
		  Scanner nbr = new Scanner(System.in);
		  int nombre = nbr.nextInt();
		  System.out.println("Vous avez saisi "+ nombre);
		  ArrayList <String> tab = new ArrayList<>();
		  for(int i =0; i<nombre;i++) {
			  System.out.println("saisir un titre");
			  	Scanner title = new Scanner(System.in);
			    String titre = title.nextLine();
			   
			    System.out.println("saisir un auteur");
			  	Scanner aut = new Scanner(System.in);
			    String auteur = aut.next();
			   
			    System.out.println("saisir un prix");
			  	Scanner price = new Scanner(System.in);
			    int prix = price.nextInt();
			    count = prix+count;
			    tab.add(titre);
			    
		  }
		   System.out.println(tab);
		   System.out.println("le nombre de livre est "+ tab.size());
		   System.out.println("le total de prix est "+ count);
		  
		
//		  **********************************************
		
  	      
  	     
  	     
	  }
  	    
	}