package afpa;

import java.util.Scanner;

public class fonction {
	
	public static void main(String[] args) {
		carre1(5);
		System.out.println(carre(6));
		Personne cda = new Personne();
		cda.manger();
		
		System.out.println(ma_fonction(15,14,2,3,10));;
	}
	
	public static  int carre( int nbre) {
		return nbre * nbre;
		
	}
	public static void carre1( int nbre) {
		System.out.println(nbre*nbre);
		
	}
	
	public static String ma_fonction (int... values) {
		System.out.println("first value:" + values[0]);
		return "nbr d'elements: " + values.length;
		}
	

	
}
 