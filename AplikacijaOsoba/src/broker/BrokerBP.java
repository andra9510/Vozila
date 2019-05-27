package broker;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class BrokerBP {
    
     private static Connection connection;
   
    public static Connection getConnection() throws SQLException{
       if(connection == null){
           connection = DriverManager.getConnection("jdbc:mysql://localhost/baza1", "root", "marea2002");
        }
        return connection;
    }
}