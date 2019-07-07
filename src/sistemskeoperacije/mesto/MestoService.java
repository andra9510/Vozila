/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemskeoperacije.mesto;

import Domain.Mesto;
import Domain.Osoba;
import broker.BrokerBP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrija
 */
public class MestoService {
    
    public List<Mesto> GetAllMesta() {
        try {
            BrokerBP.connn();
            Statement st = BrokerBP.st;
            List<Mesto> result = new ArrayList<Mesto>();
            ResultSet res = st.executeQuery("select * from mesto");
            while (res.next()) {
                Mesto mesto = new Mesto();
                mesto.setMestoId(res.getInt(1));
                mesto.setNaziv(res.getString(2));
                mesto.setPtt(res.getInt(3));
                
                result.add(mesto);
                
            }
            return result;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
    
    public boolean deletemesto(int id) throws SQLException{
        Connection conn = BrokerBP.con;
        PreparedStatement st = conn.prepareStatement("DELETE FROM mesto WHERE mestoId=?");
        st.setInt(1, id);
        int resultStatus = st.executeUpdate();
        
        if(resultStatus >0){
            return true;
        }
        return false;
    }
    
    public Mesto getMestoById(int mestoId) throws SQLException{
        try {
            BrokerBP.connn();
            Statement st = BrokerBP.st;
            
            ResultSet res = st.executeQuery("SELECT * FROM mesto WHERE mestoId="+mestoId + "");
            Mesto mesto = new Mesto();
            while (res.next()) {
                mesto.setMestoId(res.getInt(1));
                mesto.setNaziv(res.getString(2));
                mesto.setPtt(res.getInt(3));  
            }
            return mesto;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
      public boolean updatemesto(Mesto m) throws SQLException{
        
        Connection conn=BrokerBP.con;
        PreparedStatement st = conn.prepareStatement(
             "update mesto "
             + "SET "
             + "naziv=?,"
             + "ptt=? " 
             + "WHERE mestoId =?", PreparedStatement.NO_GENERATED_KEYS);
        st.setString(1, m.getNaziv());
        st.setInt(2, m.getPtt());
        st.setInt(3, m.getMestoId());
        st.execute();
        if(st.getUpdateCount()==1){
            return true;
        }
        return false;
    }
     public boolean insermesto(Mesto m)throws SQLException{
        Connection conn = BrokerBP.con;
        PreparedStatement st = conn.prepareStatement ("insert into mesto (mestoId,naziv,ptt) values (?,?,?)",
                PreparedStatement.NO_GENERATED_KEYS);
        st.setInt(1, m.getMestoId());
        st.setString(2, m.getNaziv());
        st.setInt(3, m.getPtt());
        st.execute();
        if(st.getUpdateCount()==1){
            return true;
        }
        return false;
    }
   
}


