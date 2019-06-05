
package sistemskeoperacije;

import Domain.Osoba;
import broker.BrokerBP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertovanje {
   
    public boolean insert(Osoba o) throws SQLException{
        Connection conn = BrokerBP.con;
        PreparedStatement st = conn.prepareStatement("insert into person ([Id],[Name] ,[Prezime] ,[RatumRodjenja]) values (?,?,?,?)", PreparedStatement.NO_GENERATED_KEYS);
        st.setInt(1, o.getId());
        st.setString(2, o.getName());
        st.setString(3, o.getPrezime());
        st.setInt(4, o.getDatumRodjenja());
        st.execute();
        if(st.getUpdateCount()==1){
            return true;
        }      
       return false;
 }
}
