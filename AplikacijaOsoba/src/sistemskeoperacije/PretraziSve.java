package sistemskeoperacije;

import broker.BrokerBP;
import Domain.Osoba;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PretraziSve {

    public List<Osoba> GetAllOsoaba() {
        try {
            Connection conn = BrokerBP.getConnection();
            Statement st = conn.createStatement();
            List<Osoba> result = new ArrayList<Osoba>();//lista je interfejs
            ResultSet res = st.executeQuery("select * from person");
            while (res.next()) {
                Osoba o = new Osoba();
                o.setId(res.getInt(1));
                o.setName(res.getString(2));
                o.setPrezime(res.getString(3));
                o.setDatumRodjenja(res.getInt(4));
                result.add(o);
                
            }
            return result;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
}
