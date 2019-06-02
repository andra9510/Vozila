
package sistemskeoperacije;

import broker.BrokerBP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

 public class Brisanje {

    
    public boolean delete(int id) throws SQLException{
        Connection conn = BrokerBP.con;//unutar nje kreiramo konekciju
        PreparedStatement st = conn.prepareStatement("DELETE FROM person WHERE  id=?");//upitnik  
        st.setInt(1, id);//isto setujemo upitnik
        int resultStatus = st.executeUpdate();
        
        if (resultStatus >0) {//ako je obrisan jedan ili vise redova vratice broj redova koliko je obrisano tih redova
            return true;
        }
        return false;
    }
 }

