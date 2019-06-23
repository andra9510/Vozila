
package sistemskeoperacije.mesto;

import Domain.Mesto;
import broker.BrokerBP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MestoUpdate {
    
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
    
    
}
