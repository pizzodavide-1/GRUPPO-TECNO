
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class negozioDB {
    Connection con;
   
    public Connection getCon() {
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/negozi";
        String user="root";
        String password="";
        
        try {
            Class.forName(driver);
            DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(negozioDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(negozioDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
