package ExoDao;

import java.util.List;

public class MainEtudiant {

	public static void main(String[] args) {
		//instanciation d'un objet de notre controller
		EtudiantController etudiant = new EtudiantController();
		//Creer trois etudiants
		Etudiant etudiant1 = new Etudiant("Homer", "simpson");
		Etudiant etudiant2 = new Etudiant("dupont ", "jean");
		Etudiant etudiant3 = new Etudiant("machin", "bidule");
		
//		etudiant.create(etudiant1);
//		etudiant.create(etudiant2);
//		etudiant.create(etudiant3);
		
		
		//********************Afficher tous les etudiants***************************
		
		List<Etudiant> students = etudiant.read();
		//parcourir notre tableau students
		for(Etudiant item : students) {
			System.out.println( item.getNom()+" "+item.getPrenom());
			
		}
		
		//*************************Update etudiant***********************************
		
		//etudiant2.setNom("jamal");
		//etudiant.update(etudiant2, 2);
		
		//**************************Effacer un  etudiant*****************************
		//etudiant.delete(3);
		
		
		//**************************chercher un etudiant par id***********************
		System.out.println("le find by id ");
		Etudiant etudinatcherché = etudiant.findById(5);
		System.out.println(etudinatcherché.toString());
		//**************************chercher un etudiant par nom**********************
		System.out.println("le find by Nom ");
		List<Etudiant> etudinatByNom = etudiant.findByName("dupont");
		System.out.println(etudinatByNom.toString());
	}

}
