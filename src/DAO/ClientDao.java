package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//classe de traitement
public class ClientDao implements IDao<Client> {
	//Connexion
	Connection connect = GetConnection.getConnection();
	// il importe la m�thode Create en passant l'entit� souhait�e.
	@Override
	public void create(Client objet) {
		
		PreparedStatement sql;
		try {
			sql = connect.prepareStatement("INSERT INTO client (nom, prenom) VALUES (?,?)");
			sql.setString(1, objet.getNom());
			sql.setString(2, objet.getPrenom());
			//Executer la requete
			sql.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	//*******************************premiere facon de CRUD************************************************
//    Connection connect = GetConnection.getConnection();
//    
//    public void create(String nom, String prenom) {
//    
//        /*CRUD - C avec PreparedStatement: !!!! � utiliser imp�rativement pour �viter les injections slq
//        et donc les failles de s�cu*/
//        PreparedStatement sql;
//        try {
//            sql = connect.prepareStatement("INSERT INTO client (nom,prenom) VALUES (?,?)");
//            //on set la valeur du premier ?
//            sql.setString(1, nom);
//            //on set la valeur du 2�me ?
//            sql.setString(2, prenom);
//            //puis on execute ce qu'on a pr�parer
//            sql.executeUpdate();
//            
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//    
//    //CRUD : Read:
//    
//    public List<Client> read() {
//        
//        List<Client> listeClients = new ArrayList<>();
//        
//        //pour r�cup�rer les donn�es de la table: resultset
//        ResultSet rs = null;
//        
//        //plus s�cur:
//        PreparedStatement sql2;
//        try {
//            sql2 = connect.prepareStatement("SELECT * FROM client");
//            //sql2.setString(1,"client");
//            
//            rs = sql2.executeQuery();
//            while(rs.next()) {
//                //System.out.println("Le nom "+rs.getString("nom")+" le prenom "+rs.getString("prenom"));
//                Client client = new Client(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"));
//                listeClients.add(client); 
//            }
//            
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return listeClients;
//        
//    }
//    //CRUD : Update:
//    public void update(Client client, int id) {
//    	try {
//			PreparedStatement sql = connect.prepareStatement("UPDATE client SET nom=?, prenom=? WHERE id=?");
//			sql.setString(1, client.getNom());
//			sql.setString(2, client.getPrenom());
//			sql.setInt(3, id);
//			
//			sql.executeUpdate();
//			System.out.println(client.getNom()+ " a ete bien modifi�");
//    	} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	
//    }
//    
//    // Delete
//    public void delete(int id) {
//		try {
//			PreparedStatement sql = connect.prepareStatement("DELETE FROM client WHERE id=?");
//			sql.setInt(1, id);
//			sql.executeUpdate();
//			System.out.println("effacement ok");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}