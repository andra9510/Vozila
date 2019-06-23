
package sistemskeoperacije.mesto;

import broker.BrokerBP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class BrisanjeMesto {
    
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
    
}
