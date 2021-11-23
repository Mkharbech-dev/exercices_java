package Enseignant;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Specialite java = new Specialite("JE","JAVA/JEE");
		Specialite html_css = new Specialite("HC","HTML/CSS");
		Specialite g_projet = new Specialite("GP","GESTION DE PROJET");
		Specialite javascript = new Specialite("JS","JAVASCRIPT");
		Specialite php = new Specialite("PHP","PHP");
		
		Enseingant moussa = new Enseingant("camara", "moussa", "camara@yahoo.fr",java);
		
		Enseingant imane = new Enseingant("dupont", "imane", "imane@yahoo.fr",java);
		
		Enseingant sarah = new Enseingant("dupont", "sarah", "sarah_12@yahoo.fr",php);
		
		Enseingant malak = new Enseingant("dupont", "malak", "malak@yahoo.fr",javascript);
	
		ArrayList<Specialite> tab_sp = new ArrayList<Specialite>();
		tab_sp.add(java);
		tab_sp.add(html_css);
		tab_sp.add(g_projet);
		tab_sp.add(javascript);
		tab_sp.add(php);
		
		
		tab_sp.forEach(item->System.out.println(item.getLibelle()));
		
		
		ArrayList<Enseingant> tab = new ArrayList<Enseingant>();
		tab.add(moussa);
		tab.add(imane);
		tab.add(sarah);
		tab.add(malak);
		
		System.out.println("***************************************************");
		
		tab.forEach(item->System.out.println(item));
		
		
		
//		System.out.println("java : ");
//		for(int i = 0; i<tab.size();i++) {
//			//Liste des enseigant par sepecialité
//			if(tab.get(i).getSpecialite().equals(java)) {
//				System.out.println( tab.get(i).getNom()+ " "+ tab.get(i).getPrenom());
//			}
//		}
//		
//		System.out.println("HTML/CSS : ");
//		for(int i = 0; i<tab.size();i++) {
//			//Liste des enseigant par sepecialité
//			if(tab.get(i).getSpecialite().equals(html_css)) {
//				System.out.println( tab.get(i).getNom()+ " "+ tab.get(i).getPrenom());
//			}
//		}
//		
//		System.out.println("GESTION DE PROJET : ");
//		for(int i = 0; i<tab.size();i++) {
//			//Liste des enseigant par sepecialité
//			if(tab.get(i).getSpecialite().equals(g_projet)) {
//				System.out.println( tab.get(i).getNom()+ " "+ tab.get(i).getPrenom());
//			}
//		}
//		
//		System.out.println("JAVASCRIPT: ");
//		for(int i = 0; i<tab.size();i++) {
//			//Liste des enseigant par sepecialité
//			if(tab.get(i).getSpecialite().equals(javascript)) {
//				System.out.println( tab.get(i).getNom()+ " "+ tab.get(i).getPrenom());
//			}
//		}
//		
//		System.out.println("PHP : ");
//		for(int i = 0; i<tab.size();i++) {
//			//Liste des enseigant par sepecialité
//			if(tab.get(i).getSpecialite().equals(php)) {
//				System.out.println( tab.get(i).getNom()+ " "+ tab.get(i).getPrenom());
//			}
//		}
		 
		
	}
	
		
}
