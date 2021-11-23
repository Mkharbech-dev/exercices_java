package Etudiant;

import java.util.ArrayList;

import Enseignant.Specialite;

public class Main {

	public static void main(String[] args) {
		
		Filiere informatique = new Filiere("info", "informatique");
		Filiere techno = new Filiere("techno", "Techno de l'info et de communication");
		Filiere genie = new Filiere("genie", "Génie civil");
		Filiere market = new Filiere("genie", "Marketing");
		
		ArrayList<Filiere> tab_filiere = new ArrayList<Filiere>();
		tab_filiere.add(informatique);
		tab_filiere.add(techno);
		tab_filiere.add(genie);
		
		
		for(int i = 0; i<tab_filiere.size();i++) {
			//Liste des filieres :
			System.out.println("Filiere: " + tab_filiere.get(i));
			
		}
		
		System.out.println("_______________________________________________");
		
		//Instanciation des etudiants
		Etudiant moussa = new Etudiant("camara", "moussa", informatique );
		Etudiant homer = new Etudiant("Homer", "simpson", informatique );
		Etudiant machin = new Etudiant("machin", "bidule", market );
		Etudiant jean = new Etudiant("dupont", "jean", genie );
		Etudiant bart = new Etudiant("bart", "simpson", genie );
		
		ArrayList<Etudiant> tab_etudiant = new ArrayList<Etudiant>();
		tab_etudiant.add(moussa);
		tab_etudiant.add(homer);
		tab_etudiant.add(machin);
		tab_etudiant.add(jean);
		tab_etudiant.add(bart);
		
		System.out.println("Filiére: informatique ");
		for(int i = 0; i<tab_etudiant.size();i++) {
			//Liste des filieres :
			if(tab_etudiant.get(i).getFiliere().equals(informatique)) {
				System.out.println("Je suis l'etudiant :" + tab_etudiant.get(i).getNom()+ " "+ tab_etudiant.get(i).getPrenom());
					}
				}	
		System.out.println("Filiére: Marketing ");
			for(int i = 0; i<tab_etudiant.size();i++) {
				if(tab_etudiant.get(i).getFiliere().equals(market)) {
					System.out.println("Je suis l'etudiant :" + tab_etudiant.get(i).getNom()+ " "+ tab_etudiant.get(i).getPrenom());
					}
				}	
		System.out.println("Filiére: Génie civile ");
			for(int i = 0; i<tab_etudiant.size();i++) {
				if(tab_etudiant.get(i).getFiliere().equals(genie)) {
				System.out.println("Je suis l'etudiant :" + tab_etudiant.get(i).getNom()+ " "+ tab_etudiant.get(i).getPrenom());
					}	
				}
	}

}
