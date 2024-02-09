
package project;
import java.sql.*;
//import java.sql.Connection; //instead of import java.sql.*; we use the Connection
import java.sql.DriverManager;
import java.sql.SQLException;
        
        
public class ConnectionProvider {
    public static Connection  getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root",""); // i did not declared a password;
            return con;
        }
            catch(Exception e)
        {
            return null;
        }
    }
    
}
