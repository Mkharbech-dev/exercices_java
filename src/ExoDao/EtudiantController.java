package ExoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EtudiantController implements IDao<Etudiant>{
			//Connexion
			Connection connect = ConnectionDao.getConnection();
			//pour récupérer les données de la table: resultset
			ResultSet rs = null;
		// il importe la méthode Create en passant l'entité souhai
		@Override
			public void create(Etudiant objet) {
			PreparedStatement sql;
				try {
					sql = connect.prepareStatement("INSERT INTO Etudiant (nom, prenom) VALUES (?,?)");
					sql.setString(1, objet.getNom());
					sql.setString(2, objet.getPrenom());
					
					//Executer la requete
					sql.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
//*******************************************Read********************************************************************	
		@Override
			public List<Etudiant> read() {
	        List<Etudiant> listeEtudiants = new ArrayList<>();
	        
	        try {
	        	PreparedStatement req = connect.prepareStatement("SELECT * FROM Etudiant ");
	            rs = req.executeQuery();
	            while(rs.next()) {
	            	Etudiant student = new Etudiant(rs.getString("nom"), rs.getString("prenom"));
	            	listeEtudiants.add(student); 
	            }
	            
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return listeEtudiants;
//*******************************************Update********************************************************************	
}
		@Override
			public void update(Etudiant objet, int id) {
					
		        try {
		            PreparedStatement req = connect.prepareStatement("UPDATE Etudiant SET nom=? , prenom= ? where id= ? ");
		            req.setString(1, objet.getNom());
		            req.setString(2, objet.getPrenom());
		            req.setInt(3, id);
		            //System.out.println(req);
		            req.executeUpdate();   
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
			}
//*******************************************Delete***************************************************************	
		@Override
			public void delete(int id) {
				try {
		            PreparedStatement req = connect.prepareStatement("DELETE FROM Etudiant where id= ? ");
		            req.setInt(1, id);
		            //System.out.println(req);
		            req.executeUpdate();   
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
				
			}
//*******************************************findById*************************************************************	
		@Override
		public Etudiant findById(int id) {
			 PreparedStatement sql2;
			 Etudiant studentById =null;
		        try {
		            sql2 = connect.prepareStatement("SELECT * FROM Etudiant where id=?");
		            sql2.setInt(1, id);
		            rs = sql2.executeQuery();
		            while(rs.next()) {
		            	studentById = new Etudiant(rs.getString("nom"), rs.getString("prenom"));
		            }
		            
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
			return studentById;
		}
		
//*******************************************findByName**********************************************************
		@Override
		public List<Etudiant> findByName(String nom) {
			
		        List<Etudiant> listeEtudiants = new ArrayList<>();
		        
		        try {
		        	PreparedStatement req = connect.prepareStatement("SELECT * FROM Etudiant where nom=?");
		        	req.setString(1, nom);
		            rs = req.executeQuery();
		            while(rs.next()) {
		            	Etudiant student = new Etudiant(rs.getString("nom"), rs.getString("prenom"));
		            	listeEtudiants.add(student); 
		            }
		            
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		        return listeEtudiants;
		}
		

		



	
}
