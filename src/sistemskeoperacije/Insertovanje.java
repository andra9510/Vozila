
package sistemskeoperacije;

import broker.BrokerBP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insertovanje {
   
    public boolean insert( int id, String firstname, String lastname, byte age) throws SQLException{
        Connection conn = BrokerBP.con;
        PreparedStatement st = conn.prepareStatement("insert into person value (null,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);//generise sam kljuc
        st.setString(1, firstname);  //na mestu prvog upitnika setujemo   firstname                                    //ovo gore null kazemo da je prvo a ovo ostalo setujemo sami 
        st.setString(2, lastname);
        st.setInt(3, age);
        st.setInt(4, id);
        st.execute();
        ResultSet keys = st.getGeneratedKeys();//vraca generisane kljuceve //(generated key)kada se kljuc generise po auto inkrementu,necemo mi upisivatii vrednost vec ce sam  da se autoinkrementuje
        if(!keys.isBeforeFirst()){ //ukoliko ta vrednost koju smo pokupili keys isBeforeFirst proveravamo da li je pre prvog, prvog podatka u nasoj tabeli.
            return false;//Ti mi vrati false
        }else{
            keys.next();//pokupi naredni generated key
            id = keys.getInt(1);//kupi narednu vrednost
        }
        return true;
    }
}
