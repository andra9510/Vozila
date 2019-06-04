
package sistemskeoperacije;

import broker.BrokerBP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Insertovanje {
   
    public boolean insert( int id, String Name, String Prezime, int DatumRodjenja) throws SQLException{
        Connection conn = BrokerBP.con;
        PreparedStatement st = conn.prepareStatement("insert into person value (null,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);//generise sam kljuc
        st.setInt(1, id);  //na mestu prvog upitnika setujemo   firstname                                    //ovo gore null kazemo da je prvo a ovo ostalo setujemo sami 
        st.setString(2, Name);
        st.setString(3, Prezime);
        st.setInt(4, DatumRodjenja);
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
        

