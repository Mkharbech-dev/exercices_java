package Jeu;

public class Main {

	public static void main(String[] args) {
		
		
		Arme Excalibur = new Arme("Excalibur", 10, Type.épée);
		Arme couteau = new Arme("couteau", 300, Type.couteau);
		Arme marteau = new Arme("Marteau", 15, Type.masse);
		Arme pistolet = new Arme("pistolet", 1000, Type.pistolet);
		Arme arc = new Arme("arc", 300, Type.arc);
		//System.out.println(saif);
		Joueur zelda = new Joueur("Zelda");
		System.out.println(zelda);
		zelda.porterArme(Excalibur);
		
		System.out.println("********************************************************************************************");
		
		Joueur mario = new Joueur("Mario");
		mario.porterArme(marteau);
		System.out.println(mario);
		
		System.out.println("************************lors de l'attaque************************************************************");
		//Lors de l'attaque
		zelda.attaquer(mario, arc);
		System.out.println(zelda);
		System.out.println(mario);
		
		if(zelda.force>mario.force) {
			System.out.println("le vainquer est "+zelda.nom );
			System.out.println("le perdant est "+mario.nom );
		}else if(zelda.force<mario.force){
			System.out.println("le vainquer est "+mario.nom );
			System.out.println("le perdant est "+zelda.nom );
		}else {
			System.out.println(" match null ");
		}
		 System.out.println("\t***********************match contre zelda1 contre mario1***************************************************\n");
		 
		 	Joueur zelda1 = new Joueur("Zelda1");
			System.out.println(zelda1);
			zelda1.porterArme(Excalibur);
			
			System.out.println("********************************************************************************************");
			
			Joueur mario1 = new Joueur("Mario1");
			System.out.println(mario1);
			mario1.porterArme(marteau);
			System.out.println("******************************apres l'attaque***********************************************");
			
			while(zelda1.santé!=0 && mario1.santé!=0) {
				
				zelda.attaquer(mario1, arc);
				System.out.println(zelda1);
				System.out.println(mario1);
				
				if(zelda.force>mario1.force) {
					System.out.println("le vainquer est "+zelda1.nom );
					System.out.println("le perdant est "+mario1.nom );
					
				}else if(zelda1.force<mario1.force){
					System.out.println("le vainquer est "+mario1.nom );
					System.out.println("le perdant est "+zelda1.nom );
					
				}else {
					System.out.println(" match null ");
				}
				System.out.println("************************************************************************");
				if(mario1.santé == 0 ) {
					System.out.println(zelda1.nom+ " a gagné ");
					System.out.println(mario1.nom+ " a été tué ");
				}else if(zelda1.santé == 0 ) {
					System.out.println(mario1.nom+ " a gagné ");
					System.out.println(zelda1.nom+ " a été tué ");
				}
			}
		
	}

}
