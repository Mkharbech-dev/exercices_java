package DAO;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GetConnection.getConnection();
		//Creer un nouveau client
		ClientDao salah = new ClientDao();
		//salah.create("Mkharbech", "salah");
		
		
		//Afficher un nouveau client
		
		List<Client> clients = salah.read();
		
		for(Client item : clients) {
			System.out.println(item.getId()+" "+item.getNom()+" "+item.getPrenom());
			
		}
		
		//Update client
		
		Client afpa = new Client("marrakech", "maroc");
		
		salah.update(afpa, 58);
		
		//Delete
				//salah.delete(56);		
		}	
}
