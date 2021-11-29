package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection{
	
public static Connection getConnection() {
    String url = "jdbc:mysql://localhost/";
    String dbName = "cda_21157";
    String user="root";
    String pwd="";
    
    
    Connection connect = null;
    try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         try {
            connect = DriverManager.getConnection(url+dbName,user,pwd);
            System.out.println("OK vous etes bien connecté");
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
