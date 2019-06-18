package sistemskeoperacije;

import Domain.Osoba;
import broker.BrokerBP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class Update {

    public boolean update(Osoba o) throws SQLException{
        
     Connection conn = BrokerBP.con;
        PreparedStatement st = conn.prepareStatement("update person "
                + "SET "
                + "firstname=?,"
                + "lastname=?,"
                + "age=? "
                + "WHERE id =?", PreparedStatement.NO_GENERATED_KEYS);        
        st.setString(1, o.getName());
        st.setString(2, o.getPrezime());
        st.setInt(3, o.getDatumRodjenja());
        st.setInt(4, o.getId());
        st.execute();
        if(st.getUpdateCount()==1){
            return true;
        }      
       return false;
    }
}