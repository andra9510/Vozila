package sistemskeoperacije.osoba;

import broker.BrokerBP;
import Domain.Osoba;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sistemskeoperacije.mesto.MestoService;

public class OsobaService {

    public List<Osoba> GetAllOsoba() {
        try {
            BrokerBP.connn();
            Statement st = BrokerBP.st;
            List<Osoba> result = new ArrayList<Osoba>();//lista je interfejs
            ResultSet res = st.executeQuery("select * from person");
            while (res.next()) {
                Osoba o = new Osoba();
                o.setId(res.getInt(1));
                o.setName(res.getString(2));
                o.setPrezime(res.getString(3));
                o.setDatumRodjenja(res.getInt(4));
                
                o.setMesto(new MestoService().getMestoById(res.getInt(5)));
                
                result.add(o);
                
            }
            return result;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }  
    public boolean Update(Osoba o) throws SQLException{
        
     Connection conn = BrokerBP.con;
        PreparedStatement st = conn.prepareStatement(
                 "update person "
                + "SET "
                + "firstname=?,"
                + "lastname=?,"
                + "age=?, "
                + "mestoId=? "
                + "WHERE id =?", PreparedStatement.NO_GENERATED_KEYS);        
        st.setString(1, o.getName());
        st.setString(2, o.getPrezime());
        st.setInt(3, o.getDatumRodjenja());
        st.setInt(4, o.getMesto().getMestoId());
        st.setInt(5, o.getId());
        st.execute();
        if(st.getUpdateCount()==1){
            return true;
        }      
       return false;
    }    
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
    public boolean Insert(Osoba o) throws SQLException{
        Connection conn = BrokerBP.con;
        PreparedStatement st = conn.prepareStatement("insert into person (id,firstname,lastname,age, mestoId) values (?,?,?,?,?)", PreparedStatement.NO_GENERATED_KEYS);
        st.setInt(1, o.getId());
        st.setString(2, o.getName());
        st.setString(3, o.getPrezime());
        st.setInt(4, o.getDatumRodjenja());
        st.setInt(5, o.getMesto().getMestoId());
        st.execute();
        if(st.getUpdateCount()==1){
            return true;
        }      
       return false;
 }
}
