/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemskeoperacije.mesto;

import Domain.Mesto;
import broker.BrokerBP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertovanjeMesto {
    
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
