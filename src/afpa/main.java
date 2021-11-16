package afpa;

import java.util.Scanner;

class main {
	
	  public static void main(String[] args) {
		  
		System.out.println("saisir un mot");
	  	Scanner salah = new Scanner(System.in);

	    String str =salah.next();
	    String reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	      System.out.println(str.charAt(i));
	    }
	   

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	    
	    salah.close();
	  }
	}