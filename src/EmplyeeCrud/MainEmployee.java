package EmplyeeCrud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class MainEmployee {

	
	public static void main(String[] args) {
		List<Employee> c = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		int choix;
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("Entrez votre choix : ");
			choix = sc.nextInt();
			
			switch (choix) {
			case 1: 
				System.out.println("entrer code : ");
				int code = sc.nextInt();	
				System.out.println("entrer nom : ");
				String nom = sc1.nextLine();	
				System.out.println("entrer salaire : ");
				int salaire = sc.nextInt();	
				c.add(new Employee(code,nom,salaire));
			break;
			
			case 2:
				System.out.println("------------------------------");
				Iterator<Employee> i = c.iterator();
				while(i.hasNext()) {
					Employee e = i.next();
					System.out.println(e);
				}
				System.out.println("------------------------------");
			break;
			case 3:
				boolean found = false;
				System.out.println("Entrer le code à chercher :");
				int codeAChercher = sc.nextInt();
				System.out.println("------------------------------");
			    i = c.iterator();
				while(i.hasNext()) {
					Employee e = i.next();
					if(e.getCode() == codeAChercher) {
						System.out.println(e);
						found = true;
					}
				}
				if(!found) {
					System.out.println("pas trouvé");
				}
				System.out.println("------------------------------");
				break;
				
			case 4:
				found = false;
				System.out.println("Entrer le code à supprimer :");
				int codeASupprimer = sc.nextInt();
				System.out.println("------------------------------");
			    i = c.iterator();
				while(i.hasNext()) {
					Employee e = i.next();
					if(e.getCode() == codeASupprimer) {
						i.remove();
						found = true;
					}
				}
				if(!found) {
					System.out.println("pas trouvé");
				}else {
					System.out.println("employee a été bien supprimé");
				}
				System.out.println("------------------------------");
				break;
			case 5:
				found = false;
				System.out.println("Entrer le code à MODIFIER :");
				int codeAModifier = sc.nextInt();
				System.out.println("------------------------------");
				ListIterator<Employee> liste = c.listIterator();
			    i = c.iterator();
				while(liste.hasNext()) {
					Employee e = liste.next();
					if(e.getCode() == codeAModifier) {
						System.out.println("entrer un nouveau nom");
						nom = sc1.nextLine();
						System.out.println("entrer un nouveau salaire");
						salaire = sc.nextInt();
						
						liste.set(new Employee(codeAModifier,nom,salaire));
						found = true;
					}
				}
				if(!found) {
					System.out.println("pas trouvé");
				}else {
					System.out.println("employee a été bien modifié");
				}
				System.out.println("------------------------------");
				break;
					}
			}while(choix!=0);
		}

}
