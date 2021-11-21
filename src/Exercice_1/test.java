package Exercice_1;

public class test {

	public static void main(String[] args) {
		//Instanciation de trois objet avec deux roles Manger() et un role developpeur().
		Roles moussa  = new Roles();
		System.out.println(moussa +" et mon role est "+ moussa.Manager());
		Roles yan  = new Roles();
		System.out.println(yan +" et mon role est "+ yan.Manager());
		Roles Salah = new Roles();
		System.out.println(Salah +" et mon role est "+ Salah.developpeur());
		
//		********************************instanciation de trois roles*********************
		Roles malak = new Roles();
		System.out.println(malak.ChefDeProjet());
		Roles imane = new Roles();
		System.out.println(imane.Manager());
		Roles sara = new Roles();
		System.out.println(sara.developpeur());
	}
}
