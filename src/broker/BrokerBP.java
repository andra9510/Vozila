package broker;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;
public class BrokerBP {
    
    
   public static Statement st;
    public static Connection con;
    
   
    public static void connn() {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/baza1", "root", "marea2002");
            st=con.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
     
    }}
    
