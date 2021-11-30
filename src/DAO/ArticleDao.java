package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Controller
// Je passe le type de mon objet ici
public class ArticleDao implements IDao<Article>{
	//Connexion
		Connection connect = GetConnection.getConnection();
	// il importe la méthode Create en passant l'entité souhaitée.
	@Override
	public void create(Article objet) {
		
		PreparedStatement sql;
		try {
			sql = connect.prepareStatement("INSERT INTO article (titre, auteur) VALUES (?,?)");
			sql.setString(1, objet.getTitre());
			sql.setString(2, objet.getAuteur());
			//Executer la requete
			sql.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
}
