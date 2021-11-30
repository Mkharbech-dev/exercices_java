package ExoDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDao{
	
public static Connection getConnection() {
    String url = "jdbc:mysql://localhost/";
    String dbName = "DAO";
    String user="root";
    String pwd="";
    
    
    Connection connect = null;
    try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         try {
            connect = DriverManager.getConnection(url+dbName,user,pwd);
            System.out.println("bravo, bonne connexion");
            } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } catch (Exception e) {
        e.getMessage();
    }
    return connect;
   }

}

