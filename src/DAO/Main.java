package DAO;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GetConnection.getConnection();
		//Creer un nouveau client
		//ClientDao client = new ClientDao();
		
//		client.create(new Client("mkharbech", "imane"));
//		client.create(new Client("mkharbech", "sara"));
//		client.create(new Client("mkharbech", "malak"));
		
		
		ArticleDao article = new ArticleDao();
		
		article.create(new Article("la france", "salah"));
		article.create(new Article("la suisse", "malak"));
		article.create(new Article("la belgique", "imane"));
	
		//***************************************premiere facon******************************************
//		ClientDao salah = new ClientDao();
//		salah.create("Mkharbech", "sara");
//		
//		
//		//Afficher un nouveau client
//		
//		List<Client> clients = salah.read();
//		
//		for(Client item : clients) {
//			System.out.println(item.getId()+" "+item.getNom()+" "+item.getPrenom());
//			
//		}
//		
//		//Update client
//		
//		Client afpa = new Client("marrakech", "maroc");
//		
//		salah.update(afpa, 58);
//		
//		//Delete
//				salah.delete(56);		
	}	
}
